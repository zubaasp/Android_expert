package com.example.favorite.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.core.domain.usecase.SekolahUsecase
import javax.inject.Inject

class ViewModelFactory @Inject constructor(private val sekolahUsecase: SekolahUsecase) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        when {
            modelClass.isAssignableFrom(FavoriteViewModel::class.java) -> {
                FavoriteViewModel(sekolahUsecase) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }
}