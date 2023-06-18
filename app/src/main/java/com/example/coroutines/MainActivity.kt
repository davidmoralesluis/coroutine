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
            runBlocking {
                coroutinSuspend()
                println("Final")
            }

        }
    }

    suspend fun coroutinSuspend() = coroutineScope { // this: CoroutineScope
        launch {
            delay(2000L) // non-blocking delay for 2 second (default time unit is ms)
            println("World_2sec") // print after delay
        }
        launch {
            delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
            println("World_1sec") // print after delay
        }
        println("Hello")
        }

}