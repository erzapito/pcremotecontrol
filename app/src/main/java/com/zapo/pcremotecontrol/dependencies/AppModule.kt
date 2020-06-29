package com.zapo.pcremotecontrol.dependencies

import com.zapo.pcremotecontrol.network.ConnectionManager
import com.zapo.pcremotecontrol.network.RealConnectionManager
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
abstract class AppModule {

    @Binds
    abstract fun provideConnectionManager(realConnectionManager: RealConnectionManager): ConnectionManager

}