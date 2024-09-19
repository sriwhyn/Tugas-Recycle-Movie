package com.sriwahyuni.latihan6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sriwahyuni.latihan6.adapter.BuahAdapter
import com.sriwahyuni.latihan6.model.MockList
import com.sriwahyuni.latihan6.model.ModelBuah

class RecycleBuahImageActivity : AppCompatActivity() {

    private lateinit var rv_buah : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_buah_image)
        rv_buah = findViewById(R.id.rv_buah)

        rv_buah.layoutManager = GridLayoutManager(this, 1,
            GridLayoutManager.VERTICAL, false)

        val adapter = BuahAdapter(MockList.getModel() as ArrayList<ModelBuah>)
            rv_buah.adapter =adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}