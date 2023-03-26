package com.asj.happyplaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fabAddPlaces:FloatingActionButton=findViewById(R.id.fabAddPlaces)
        fabAddPlaces.setOnClickListener {
            val intent=Intent(this,AddPlaces::class.java)
            startActivity(intent)
        }
    }
}