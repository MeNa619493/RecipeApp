package com.example.recipeapp

sealed class Screen(val route: String) {
    object RecipeScreen : Screen("recipescreen")
    object DetailsScreen : Screen("detailsscreen")
}