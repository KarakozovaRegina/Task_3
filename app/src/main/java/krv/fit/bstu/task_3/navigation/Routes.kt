package krv.fit.bstu.task_3.navigation

sealed class Routes(val route: String) {

    object Home : Routes("home")
    object ListTransaction : Routes("listTransaction")
}