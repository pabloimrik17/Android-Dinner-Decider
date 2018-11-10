package com.example.etherless.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf("Chines", "Hamburger", "Pizza", "Indian")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random();
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            if (addFoodTxt.text.isNotEmpty()) {
                foodList.add(addFoodTxt.text.trim().toString())
                addFoodTxt.text.clear()
            }
        }
    }
}
