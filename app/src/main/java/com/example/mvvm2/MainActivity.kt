package com.example.mvvm2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm2.model.users
import com.example.mvvm2.ui.theme.Mvvm2Theme
import com.example.mvvm2.view.allUser
import com.example.mvvm2.view.detail

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Mvvm2Theme {
                val navController = rememberNavController()
                val userViewModel: UserViewModel = viewModel()

                NavHost(
                    navController = navController,
                    startDestination = NavDestination.List
                ) {
                    composable(NavDestination.List) {
                        allUser(
                            listUser = users,
                            onItemClicked = {
                                userViewModel.setUser(it)
                                navController.navigate(NavDestination.Detail)
                            }
                        )
                    }

                    composable(NavDestination.Detail) {
                        val bulan = userViewModel.user.collectAsState().value
                        detail(user = bulan)
                    }
                }
            }
        }
    }
}