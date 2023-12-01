package com.example.daggermvvmpractice

import android.app.Application
import com.example.daggermvvmpractice.di.component.DaggerAppComponent

class App : Application() {
    val appComponent = DaggerAppComponent.create()
}
