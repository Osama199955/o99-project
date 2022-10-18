package com.watchlive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {

    lateinit var matchbtn : Button
    lateinit var channelbtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match)

        matchbtn = findViewById(R.id.Match_button)
        channelbtn = findViewById(R.id.Channel_button)


        matchbtn.setOnClickListener {
            val myIntent = Intent(this , MatchActivity::class.java)

            startActivity(myIntent)
        }
        channelbtn.setOnClickListener {
            val myIntent = Intent(this , ChannelActivity::class.java)

            startActivity(myIntent)
        }



    }
}