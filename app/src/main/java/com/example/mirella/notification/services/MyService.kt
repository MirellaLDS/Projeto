package com.example.mirella.notification.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyService : Service() {

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {

        var test = intent.extras["KEY1"].toString()

        Toast.makeText(applicationContext, test, Toast.LENGTH_LONG).show()

//            var i = 0
//            while (i < 3){
//                Toast.makeText(applicationContext, (i+1).toString(), Toast.LENGTH_LONG).show()
//                Thread.sleep(2000)
//            }


        //TODO do something useful
        return Service.START_NOT_STICKY
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}
