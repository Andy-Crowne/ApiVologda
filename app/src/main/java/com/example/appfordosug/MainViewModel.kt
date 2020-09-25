package com.example.appfordosug

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appfordosug.model.ArtObj
import com.example.appfordosug.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response


class MainViewModel(private val repository: Repository): ViewModel() {

    val myResponse: MutableLiveData<Response<List<ArtObj>>> = MutableLiveData()

    fun getArtModel(){
        viewModelScope.launch {
            val response = repository.getObjects()
            myResponse.value = response
        }
    }
    fun getCustomModel(name: String, adressCurrent: String, vidObj: String){
        viewModelScope.launch {
            var response = repository.getCustomObj(name,adressCurrent,vidObj)
            myResponse.value = response
        }
    }

}