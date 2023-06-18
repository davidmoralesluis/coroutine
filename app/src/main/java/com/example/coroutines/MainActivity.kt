package com.example.coroutines

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.constraintlayout.R
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            coroutin()
            println("Final")
        }

    }

     fun coroutin() = runBlocking {
            repeat(1000) {
                launch {
                    delay(1000L)
                    println("-----")
                }
            }
        }

}