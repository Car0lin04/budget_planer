package com.example.budgetplaner_30.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private val _navigateToActivity = MutableLiveData<Boolean>()
    val navigateToActivity: LiveData<Boolean>
        get() = _navigateToActivity

    fun onImageButtonClicked() {
        _navigateToActivity.value = true
    }
}