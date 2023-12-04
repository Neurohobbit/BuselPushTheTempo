package com.example.daggermvvmpractice.di.component

import com.example.daggermvvmpractice.di.module.ViewModelModule
import com.example.data.di.NetworkModule
import com.example.data.di.UseCaseModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NetworkModule::class,
        ViewModelModule::class,
        UseCaseModule::class
    ]
)
interface AppComponent
