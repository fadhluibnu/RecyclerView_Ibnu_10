package com.example.recyclerview_ibnu_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailBeritaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_berita2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val berita = intent.getParcelableExtra<berita>(MainActivity.INTENT_PARCELABLE)

        val imageBerita = findViewById<ImageView>(R.id.img_item_photo)
        val judulBerita = findViewById<TextView>(R.id.tv_item_name)
        val deskripsi = findViewById<TextView>(R.id.tv_item_description)

        imageBerita.setImageResource(berita?.imageBerita!!)
        judulBerita.text = berita.judulBerita
        deskripsi.text = berita.deskripsi
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}