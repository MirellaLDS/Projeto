package com.example.mirella.notification.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast
import com.example.mirella.notification.AsyncTask.AsyncTaskExample

class MyService : Service() {

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {

        var test = intent.extras["KEY1"].toString()
        Toast.makeText(applicationContext, test, Toast.LENGTH_LONG).show()

        AsyncTaskExample({
//            You should not rely on onDestroy() because it only gets called, when
// service is properly stopped (by calling stopService() or stopSelf() method).
            stopSelf()
            Log.i(">>> TEST:", "Killer")
        }).execute()

        //TODO do something useful
        return Service.START_NOT_STICKY
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}
