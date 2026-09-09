package com.dominik.control.kidshield.dashboard.ui.controller

import androidx.lifecycle.ViewModel
import com.dominik.control.kidshield.dashboard.data.repository.AuthManager
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val authManager: AuthManager
) : ViewModel() {
    fun logout() {
        authManager.logout()
    }
}
