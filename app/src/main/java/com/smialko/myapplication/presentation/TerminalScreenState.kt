package com.smialko.myapplication.presentation

import com.smialko.myapplication.data.Bar

sealed class TerminalScreenState {

    object Initial : TerminalScreenState()
    object Loading : TerminalScreenState()

    data class Content(val barList: List<Bar>, val timeFrame: TimeFrame) : TerminalScreenState()
}