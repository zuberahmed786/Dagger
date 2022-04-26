package com.zmq.dagger

import javax.inject.Inject

class UserRegistration @Inject constructor(private val userRepository: SaverUser,
private val sendEmail: Notification) {

    fun registerUser(email:String,password:String)
    {
        userRepository.saveUser(email,password)
        sendEmail.send(email,"zuber","hello")
    }
}