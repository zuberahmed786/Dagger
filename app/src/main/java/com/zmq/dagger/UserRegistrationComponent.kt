package com.zmq.dagger

import dagger.Component

@Component(modules = [SendEmailModule::class,UserRepositoryModule::class])
interface UserRegistrationComponent {
    fun getUserRegistration(mainActivity: MainActivity)
}