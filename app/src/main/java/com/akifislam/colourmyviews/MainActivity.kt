package com.akifislam.colourmyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }


    private fun setListeners(){
        val box_text_one: View = findViewById(R.id.box_one)
        val box_text_two: View = findViewById(R.id.box_two)
        val box_text_three: View = findViewById(R.id.box_three)
        val box_text_four: View = findViewById(R.id.box_four)
        val box_text_five: View = findViewById(R.id.box_five)
        val constraint_layout: View = findViewById(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(box_text_one, box_text_two, box_text_three, box_text_four, box_text_five, constraint_layout)

        for(item in clickableViews) {
            item.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for background
            R.id.box_one ->
                view.setBackgroundColor(Color.CYAN)
            R.id.box_two -> view.setBackgroundColor(Color.MAGENTA)
            // Boxes using Android color resources for background
            R.id.box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four-> view.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.box_five-> view.setBackgroundResource(android.R.color.black)

            else -> view.setBackgroundColor(Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256)))
        }
    }
}