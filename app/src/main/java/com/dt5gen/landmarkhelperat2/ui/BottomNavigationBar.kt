package com.dt5gen.landmarkhelperat2.ui

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController


@Composable
fun BottomNavigationBar(navController: NavController) {
    // Список элементов нижней навигации
    val items = listOf(
        Screen(name = "Сервисы", route = "services", icon = Icons.Default.Home),
        Screen(name = "Достопримечательности", route = "landmarks", icon = Icons.Default.Place),
        Screen(name = "Локации", route = "localities", icon = Icons.Default.LocationOn)
    )

    BottomNavigation {
        items.forEach { screen ->
            BottomNavigationItem(
                icon = { Icon(screen.icon, contentDescription = null) }, // Добавление иконки
                label = { androidx.compose.material3.Text(screen.name, style = typography.h4) }, // Отображение названия
                selected = false, // Логика выделения
                onClick = { navController.navigate(screen.route) } // Логика навигации
            )
        }
    }
}

// Данные для экрана
data class Screen(val name: String, val route: String, val icon: ImageVector)