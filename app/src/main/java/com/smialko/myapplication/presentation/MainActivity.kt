package com.smialko.myapplication.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.smialko.myapplication.ui.theme.TraidingGraphTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test()
//            TraidingGraphTheme {
//                val viewModel: TerminalViewModel = viewModel()
//                val screenState = viewModel.state.collectAsState()
//                when (val currentState = screenState.value) {
//                    is TerminalScreenState.Content -> {
//                        Terminal(bars = currentState.barList)
//                    }
//
//                    is TerminalScreenState.Initial -> {
//
//                    }
//                }
        }
    }
}
