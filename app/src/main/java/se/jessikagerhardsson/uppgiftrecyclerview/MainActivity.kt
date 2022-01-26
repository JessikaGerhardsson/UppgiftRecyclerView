package se.jessikagerhardsson.uppgiftrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    var myAdapter = RowAdapter()
    var ny = "Rad"
    var test = 0


    override fun onCreate(savedInstanceState: Bundle?) {

        val rowview = findViewById<RecyclerView>(R.id.rowRV)

        rowview.layoutManager = LinearLayoutManager(this)
        rowview.adapter = myAdapter



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.addButton).setOnClickListener {




        }

    }
}