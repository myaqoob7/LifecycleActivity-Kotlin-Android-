package com.raccoon.lifecycleactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    private val TAG="myInformation"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.i(TAG,"OnCreate Activity2")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"OnStart Activity2")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"OnResume Activity2")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"OnPause Activity2")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"OnStop Activity2")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i(TAG,"OnRestart Activity2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"OnDestroy Activity2")
    }
}