package com.example.appfordosug.api

import com.example.appfordosug.model.ArtObj
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SimpleApi {
    @GET("json.php?id_dataset=111504")
    suspend fun getObjects(): Response<List<ArtObj>>

    @GET("json.php?id_dataset=111504")
    suspend fun getCustomPosts(
        @Query("name") name: String,
        @Query("adressCurrent") adressCurrent: String,
        @Query("vidObj") vidObj: String
    ): Response<List<ArtObj>>
}