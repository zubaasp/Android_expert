package com.example.core.di

import com.example.core.domain.usecase.SekolahUsecase
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface FavoriteModule {
    fun sekolahUsecase(): SekolahUsecase
}