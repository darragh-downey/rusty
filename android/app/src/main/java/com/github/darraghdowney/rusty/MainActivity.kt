package com.github.darraghdowney.rusty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            // create a six sided die
            val dice = Dice(6)
            val roll = dice.roll()
            // find dice imageview in the layout
            val diceImg: ImageView = findViewById(R.id.roll_result)
            // get the dice image associated w/ the number rolled
            val drawableResource = when (roll) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            // set the image
            diceImg.setImageResource(drawableResource)
            // set the content description
            diceImg.contentDescription = roll.toString()

            Toast.makeText(this, "Dice Rolled $roll", Toast.LENGTH_SHORT).show()
        }
    }
}