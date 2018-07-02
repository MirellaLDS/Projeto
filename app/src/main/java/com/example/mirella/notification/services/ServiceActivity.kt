package com.example.mirella.notification.services

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mirella.notification.R
import android.content.Intent
import kotlinx.android.synthetic.main.activity_service.*


class ServiceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        btnService.setOnClickListener {
            // use this to start and trigger a service
            val i = Intent(this, MyService::class.java)
            // potentially add data to the intent
            i.putExtra("KEY1", "Value to be used by the service")
            this.startService(i)
        }
    }
}
