package com.example.data.di

import com.example.data.FetchApisUseCaseImpl
import com.example.domain.usecase.FetchApisUseCase
import dagger.Binds
import dagger.Module

@Module
interface UseCaseModule {

    @Binds
    fun bindFetchApisUseCase(fetchApisUseCase: FetchApisUseCaseImpl): FetchApisUseCase

}