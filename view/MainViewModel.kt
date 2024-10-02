package com.example.gabyb3.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _contador = MutableLiveData<Int>(0)
    var contador = _contador

    fun incrementContador(){
        _contador.value = contador.value?.plus(1)
    }
}