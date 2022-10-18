package com.watchlive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class ChannelActivity : AppCompatActivity() {

    lateinit var matchbtn : Button
    lateinit var menubtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match)

        matchbtn = findViewById(R.id.Match_button)
        menubtn = findViewById(R.id.TheList_button)


        matchbtn.setOnClickListener {
            val myIntent = Intent(this , MatchActivity::class.java)

            startActivity(myIntent)
        }


        menubtn.setOnClickListener {
            val myIntent = Intent(this , MenuActivity::class.java)

            startActivity(myIntent)
        }

    }
}