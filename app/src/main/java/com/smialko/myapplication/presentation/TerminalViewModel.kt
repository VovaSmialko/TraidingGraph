package com.smialko.myapplication.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.smialko.myapplication.data.ApiFactory
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class TerminalViewModel : ViewModel() {

    private val apiService =
        ApiFactory.apiService // we don't use in this app clean architecture!!! Just practice

    private val _state = MutableStateFlow<TerminalScreenState>(TerminalScreenState.Initial)
    val state = _state.asStateFlow()

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        Log.d("TerminalViewModel", "Exception caught: $throwable")
    }

    init {
        loadBarList()
    }

    private fun loadBarList() {
        viewModelScope.launch(exceptionHandler) {
            val barList = apiService.loadBars().barList
            _state.value = TerminalScreenState.Content(barList = barList)
        }
    }
}