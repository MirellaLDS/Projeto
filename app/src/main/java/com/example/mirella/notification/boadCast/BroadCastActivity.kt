package com.example.mirella.notification.boadCast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mirella.notification.R
import kotlinx.android.synthetic.main.activity_broad_cast.*

class BroadCastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broad_cast)

        //BroadCast dynamic
        var intentFilter = IntentFilter("MY_BROADCAST")
        registerReceiver(dynamicBroadcastReceiver, intentFilter)
        btn2.setOnClickListener {
            sendDynamicallyBroadcastReceiver()
        }

        //BroadCast static
        btn3.setOnClickListener {
            sendBroadcast(Intent("MY_BROADCAST_STATIC"))
        }
    }

    private var dynamicBroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            Toast.makeText(context, "Dinamico", Toast.LENGTH_LONG).show()
        }
    }

    private fun sendDynamicallyBroadcastReceiver() {
        val i = Intent("MY_BROADCAST")
        sendBroadcast(i)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(dynamicBroadcastReceiver);
    }
}
