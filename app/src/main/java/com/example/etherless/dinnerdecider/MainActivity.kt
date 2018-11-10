package com.example.etherless.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private val foodList: ArrayList<String> = arrayListOf("Chines", "Hamburger", "Pizza", "Indian")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random: Random = Random()
            val randomFood: Int = random.nextInt(foodList.count())
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
