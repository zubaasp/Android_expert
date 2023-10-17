package com.example.core.di

import com.example.core.domain.usecase.SekolahInteractor
import com.example.core.domain.usecase.SekolahUsecase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {
    @Binds
    @Singleton
    abstract fun provideSekolahUsecase(sekolahInteractor: SekolahInteractor): SekolahUsecase
}