package com.example.mpr1_uts_201401003_201401024.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "No recent notifications yet"
    }
    val text: LiveData<String> = _text
}