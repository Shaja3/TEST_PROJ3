package com.example.project_2_recyclerview_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.adapter.ResAdapter
import com.example.project_2_recyclerview_app.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Data source
        val resList = Datasource().loadRes()

        // adapter
        val adapter = ResAdapter(resList, this)

        // recyclerView
        val recyclerView : RecyclerView = findViewById(R.id.rv_res)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

    }
}