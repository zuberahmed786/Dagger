package com.zmq.dagger

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {
    @Provides
    fun getUserRepo():SaverUser
    {
        return SaveSQL()
    }
}