package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Dice(val number:Int){
fun roll():Int{
    return (1..number).random();
}
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val d1=Dice(6)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button=findViewById(R.id.button);
        rollButton.setOnClickListener {
            val resultTextView:ImageView=findViewById(R.id.imageView);
            val result=d1.roll();
            when(result){
                1-> resultTextView.setImageResource(R.drawable.dice_1)
                2-> resultTextView.setImageResource(R.drawable.dice_2)
                3-> resultTextView.setImageResource(R.drawable.dice_3)
                4-> resultTextView.setImageResource(R.drawable.dice_4)
                5-> resultTextView.setImageResource(R.drawable.dice_5)
                6-> resultTextView.setImageResource(R.drawable.dice_6)
            }
        }

    }

}

