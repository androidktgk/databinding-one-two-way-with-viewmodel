package com.govind8061.simplesimple

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val facts=MutableLiveData<String>("Do or Die")

    fun changeQuote(){
        facts.value="Jai Jawan Jai Kisan"
    }
}