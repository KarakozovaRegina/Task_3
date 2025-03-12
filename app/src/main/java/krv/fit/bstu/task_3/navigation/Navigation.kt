package krv.fit.bstu.task_3.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import krv.fit.bstu.task_3.page.HomeScreen
import krv.fit.bstu.task_3.page.ListTransactionPage


@Composable
fun Navigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Home.route) {

        composable(Routes.Home.route) { HomeScreen(navController) }
        composable(Routes.ListTransaction.route) { ListTransactionPage() }
    }
}