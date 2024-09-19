package com.example.premissionx.mydemo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    val fruits=mutableListOf(Fruit("Apple",R.drawable.apple),
        Fruit("Banana",R.drawable.banana),
        Fruit("Cheery",R.drawable.cherry),
        Fruit("Grape",R.drawable.grape),
        Fruit("Mango",R.drawable.mango),
        Fruit("Orange",R.drawable.orange),
        Fruit("Pear",R.drawable.pear),
        Fruit("PineApple",R.drawable.pineapple),
        Fruit("Pear",R.drawable.pear),
        Fruit("Strawberry",R.drawable.strawberry),
        Fruit("Watermelon",R.drawable.watermelon)
    )

    val fruitList=ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFruits()
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        val layoutManager=GridLayoutManager(this,2)
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=FruitAdapter(this,fruitList)
    }

    fun initFruits()
    {
        fruitList.clear()
        repeat(50)
        {
            val position=(0 until fruits.size).random()
            fruitList.add(fruits[position])
        }
    }
}