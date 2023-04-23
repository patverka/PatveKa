package com.patverka.common.prezentation

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.core.module.Module

abstract class BasePatverKaApplication : Application() {

    abstract fun getKoinModules(): List<Module>

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@BasePatverKaApplication)
            androidFileProperties()
            modules(getKoinModules())
        }
    }
}