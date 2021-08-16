package com.project.touchevents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent

class MainActivity : AppCompatActivity() {

    private val MYTAG = "Akshay"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        val action = event!!.actionMasked

        return when(action) {
            //when user just pressed the screen
            MotionEvent.ACTION_DOWN -> {
                Log.d(MYTAG, "Bhai kya touch hai!!")
                true
            }

            //action in between ACTION_DOWN and ACTION_UP
            MotionEvent.ACTION_MOVE -> {
                Log.d(MYTAG, "Bas tike rehna bhai")
                true
            }

            //finished the pressing
            MotionEvent.ACTION_UP -> {
                Log.d(MYTAG, "Arre bhai, ab nhi ho rha touch!!!!")
                true
            }

            else -> super.onTouchEvent(event)
        }


    }
}