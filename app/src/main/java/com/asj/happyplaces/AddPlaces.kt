package com.asj.happyplaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.appcompat.widget.Toolbar

class AddPlaces : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_places)
        val toolbarAddPlace:Toolbar=findViewById(R.id.toolbarAddPlace)
        setSupportActionBar(toolbarAddPlace)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbarAddPlace.setNavigationOnClickListener {
            //onBackPressed()
        }
    }
}