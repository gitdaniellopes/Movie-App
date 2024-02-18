package br.com.movieapp.presentation

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import br.com.movieapp.presentation.navigation.BottomNavigationBar
import br.com.movieapp.presentation.navigation.NavigationGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {
    
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController = navController)
        },
        content = {
            NavigationGraph(navController = navController)
        }
    )
}