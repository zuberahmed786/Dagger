package com.zmq.dagger

import dagger.Module
import dagger.Provides

@Module
class SendEmailModule {

    @Provides
    fun sendEmail() :Notification
    {
        return Message()
    }
}