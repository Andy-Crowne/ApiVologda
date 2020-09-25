package com.example.appfordosug.api

import com.example.appfordosug.units.Constants.Companion.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.SSLSession

object RetrofitInstance {
    private val okHttpEx by lazy {
        OkHttpClient.Builder()
            .followRedirects(false)
            .hostnameVerifier(HostnameVerifier() { s: String, sslSession: SSLSession -> true})
            .build()
    }

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpEx)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api : SimpleApi by lazy {
        retrofit.create(SimpleApi::class.java)
    }
}