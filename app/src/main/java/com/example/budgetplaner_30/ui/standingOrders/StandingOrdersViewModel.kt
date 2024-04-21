package com.example.budgetplaner_30.ui.standingOrders

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StandingOrdersViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Standing Orders Fragment"
    }
    val text: LiveData<String> = _text
}