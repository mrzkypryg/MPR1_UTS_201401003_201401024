package com.example.mpr1_uts_201401003_201401024.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Hi RZ MPR!"
    }
    val text: LiveData<String> = _text
}