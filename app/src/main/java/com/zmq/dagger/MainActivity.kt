package com.zmq.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistration: UserRegistration
    lateinit var email : EditText
    lateinit var password :EditText
    lateinit var submit : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        submit = findViewById(R.id.submit)

        submit.setOnClickListener {
            submit()
            println("Submitted Successfully!!!!!")
        }

    }
    fun submit()
    {

        val component = DaggerUserRegistrationComponent.builder().build()
        component.getUserRegistration(this)
        userRegistration.registerUser(email.text.toString(),password.text.toString())
        println("Email is ${email.text.toString()}")
    }
}