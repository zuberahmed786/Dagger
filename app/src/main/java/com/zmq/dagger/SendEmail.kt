package com.zmq.dagger

import javax.inject.Inject

interface Notification
{
    fun send(from:String ,to:String,body:String?)

}
class SendEmail @Inject constructor() :Notification{
   override fun send(from:String ,to:String,body:String?)
    {
        println("Email send>>>>>")
    }
}
class Message @Inject constructor():Notification
{
    override fun send(from: String, to: String, body: String?) {
        println("Message send>>>>>")

    }
}