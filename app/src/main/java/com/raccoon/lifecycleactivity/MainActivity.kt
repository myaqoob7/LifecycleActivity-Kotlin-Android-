package com.raccoon.lifecycleactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val TAG="myInformation"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG,"OnCreate")

        val mButton: Button = findViewById(R.id.mButton)
        mButton.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))

        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"OnStop")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i(TAG,"OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"OnDestroy")
    }
}