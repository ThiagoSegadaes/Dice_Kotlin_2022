package com.example.dadokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
        /**  An array containing the images to be used  **/
        val dice = arrayListOf(R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3,
        R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6)

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Variable that accesses the button **/
        val btnPlay = this.findViewById<Button>(R.id.btnPlay)
        /** Code to be performed after clicking on the button **/
        btnPlay.setOnClickListener {

            /** The imgDice variable fetches the ImageView inside the interface**/
            val imgDice = this.findViewById<ImageView>(R.id.imageView7)
            /** val valor generates a random result between the indices 0,1,2,3,4,5 **/
            val value = (0..5).random()
            /** We apply the variable value inside de Array "dado",
                sorting a random index inside the array **/
            imgDice.setImageResource(dice[value])
        }
    }
}