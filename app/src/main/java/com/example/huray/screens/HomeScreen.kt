package com.example.huray.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle


@Composable
fun HomeScreen(
    viewModel: HomeScreenViewModel) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

}
