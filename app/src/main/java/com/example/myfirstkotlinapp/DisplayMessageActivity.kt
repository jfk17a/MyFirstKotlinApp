package com.example.myfirstkotlinapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val displayMessage = intent.getStringExtra(EXTRA_MESSAGE)

        val randoNumber = Random.nextInt(0, 20)

        val messageView = findViewById<TextView>(R.id.messageStuffBlah).apply {
            text = displayMessage + " nice to meet you! I thought I would add something random to this, so here is a number between 0 and 20."
        }

        val randoView = findViewById<TextView>(R.id.random).apply {
            text = randoNumber.toString()
        }
    }
}
