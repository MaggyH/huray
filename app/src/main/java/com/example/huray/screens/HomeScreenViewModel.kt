package com.example.huray.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.huray.repositories.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

import kotlin.text.Typography.dagger

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val authRepository: AuthRepository,
) : ViewModel() {

    val uiState: StateFlow<HomeScreenUiState> = flow {

    }.catch {

    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = HomeScreenUiState.Loading,
    )
}



sealed interface HomeScreenUiState {
    data class Success(
        val introductions: List<ServiceIntroduction>,
    ) : HomeScreenUiState

    object Loading : HomeScreenUiState

}

data class ServiceIntroduction(
    val image: String,
    val title: String,
    val description: String,
)
