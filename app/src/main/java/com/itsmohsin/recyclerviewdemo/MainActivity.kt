package com.itsmohsin.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruitsList = listOf<Fruit>(
        Fruit("Mango","Joe"),
        Fruit("Apple","Frank"),
        Fruit("Banana","Tom"),
        Fruit("Gauva","Alex"),
        Fruit("Lemon","Ali"),
        Fruit("Grapes","Tony"),
        Fruit("Kiwi","Adam"),
        Fruit("Orange","Ali"),
        Fruit("Lemon","Tom"),
        Fruit("Pear","Ali"),
        Fruit("Pineapple","Adam")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.setBackgroundColor(Color.YELLOW)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerViewAdapter(fruitsList) { selectedItem: Fruit ->
            listItemClicked(selectedItem)
        }
    }

    private fun listItemClicked(fruit: Fruit){
        Toast.makeText(
            this@MainActivity,
            "Supplier of Fruit is : ${fruit.supplier}",
            Toast.LENGTH_LONG
        ).show()
    }
}