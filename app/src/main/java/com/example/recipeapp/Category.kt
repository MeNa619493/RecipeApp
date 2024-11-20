package com.example.recipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

data class CategoriesResponse(val categories: List<Category>? = null)

@Parcelize
data class Category(
    val idCategory: String? = null,
    val strCategory: String? = null,
    val strCategoryThumb: String? = null,
    val strCategoryDescription: String? = null
): Parcelable

