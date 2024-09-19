package com.sriwahyuni.latihan6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sriwahyuni.latihan6.adapter.BukuAdapter
import com.sriwahyuni.latihan6.model.ModelBuku

private lateinit var rev_data : RecyclerView
//new*
class RecycleActivityView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        rev_data = findViewById(R.id.rev_data)

//        array list
        val ListBuku = listOf(
            ModelBuku(judul = "Buku Android 1 2024", penulis = "Sri Wahyuni"),
            ModelBuku(judul = "Buku Android 2 2024", penulis = "Sri Wahyuni"),
            ModelBuku(judul = "Buku Android 3 2024", penulis = "Sri Wahyuni"),
            ModelBuku(judul = "Buku Android 4 2024", penulis = "Sri Wahyuni"),
            ModelBuku(judul = "Buku Android 5 2024", penulis = "Sri Wahyuni"),
            ModelBuku(judul = "Buku Android 6 2024", penulis = "Sri Wahyuni"),
            ModelBuku(judul = "Buku Android 7 2024", penulis = "Sri Wahyuni"),


        )
//        set adapter
        val nBukuAdapter = BukuAdapter(ListBuku)
        rev_data.apply {
            layoutManager = LinearLayoutManager(this@RecycleActivityView)
            adapter = nBukuAdapter
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}