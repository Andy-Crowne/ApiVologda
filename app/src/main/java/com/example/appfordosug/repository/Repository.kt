package com.example.appfordosug.repository

import com.example.appfordosug.api.RetrofitInstance
import com.example.appfordosug.model.ArtObj

class Repository {

    suspend fun getObjects(): retrofit2.Response<List<ArtObj>> {
        return RetrofitInstance.api.getObjects()
    }

    suspend fun getCustomObj(name: String, adressCurrent: String, vidObj: String) :retrofit2.Response<List<ArtObj>>{
        return RetrofitInstance.api.getObjects()
    }
}