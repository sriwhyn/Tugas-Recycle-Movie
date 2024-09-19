package com.sriwahyuni.latihan6

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var eUser : EditText
    private lateinit var ePassword : EditText
    private lateinit var btnLogin : Button
    private lateinit var btnList : Button
    private lateinit var btnRecycle : Button
    private lateinit var btnBuah : Button
    private lateinit var btnRecycleMovie : Button

    @SuppressLint("MissingInflated")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        eUser = findViewById(R.id.eUser)
        ePassword = findViewById(R.id.ePassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnList = findViewById(R.id.btnList)
        btnRecycle = findViewById(R.id.btnRecycle)
        btnBuah = findViewById(R.id.btnBuah)
        btnRecycleMovie = findViewById(R.id.btnRecycleMovie)

        btnLogin.setOnClickListener {
            val nUsername = eUser.text.toString()
            val nPassword = ePassword.text.toString()

            val intent = Intent(this, WelcomePageActivity ::class.java)
            intent.putExtra("username", nUsername)
            intent.putExtra("password", nPassword)

            Log.d("cek data username", nUsername)
            Log.d("cek data Password", nPassword)

            startActivity(intent)
        }
        btnRecycle = findViewById(R.id.btnRecycle)
        btnBuah = findViewById(R.id.btnBuah)

        btnList.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }

        btnRecycle.setOnClickListener {
            val intent = Intent(this, RecycleActivityView::class.java)
            startActivity(intent)
        }

        btnBuah.setOnClickListener {
            val intent = Intent(this, RecycleBuahImageActivity::class.java)
            startActivity(intent)
        }

        btnRecycleMovie.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}