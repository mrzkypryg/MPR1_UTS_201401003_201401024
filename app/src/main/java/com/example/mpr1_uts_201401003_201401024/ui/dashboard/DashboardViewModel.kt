package com.example.mpr1_uts_201401003_201401024.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "There is no champion yet! Let's be the first!"
    }
    val text: LiveData<String> = _text
}