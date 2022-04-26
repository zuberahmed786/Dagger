package com.zmq.dagger

import javax.inject.Inject
interface SaverUser
{
    fun saveUser(email: String,password: String)
}
class SaveSQL @Inject constructor():SaverUser {
    override fun saveUser(email:String,password:String)
    {
        println("User saved in SQL!!!!!")
    }
}
class SaveFireBase @Inject constructor() :SaverUser
{
    override fun saveUser(email: String, password: String) {
        println("User saved in FireBase!!!!!")
    }
}