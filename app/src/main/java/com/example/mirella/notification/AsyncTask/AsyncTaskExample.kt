package com.example.mirella.notification.AsyncTask

import android.os.AsyncTask
import android.util.Log
import android.widget.Toast

class AsyncTaskExample(var handler: () -> Unit): AsyncTask<String, String, String>() {
    override fun doInBackground(vararg params: String?): String {

        var i = 0
        while (i < 3){
            Log.i(">>> TEST: ", i.toString())
            Thread.sleep(10000)
            i++
        }

        handler()
        return ""

    }

}