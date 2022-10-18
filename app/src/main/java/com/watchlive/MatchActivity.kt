package com.watchlive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MatchActivity : AppCompatActivity() {


    lateinit var channelbtn : Button
    lateinit var menubtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match)

        channelbtn = findViewById(R.id.Channel_button)
        menubtn = findViewById(R.id.TheList_button)


        channelbtn.setOnClickListener {
            val myIntent = Intent(this , ChannelActivity::class.java)

            startActivity(myIntent)
        }


        menubtn.setOnClickListener {
            val myIntent = Intent(this , MenuActivity::class.java)

            startActivity(myIntent)
        }

    }
}