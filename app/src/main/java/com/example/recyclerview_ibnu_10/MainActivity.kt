package com.example.recyclerview_ibnu_10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val beritalist = listOf<berita>(
            berita(
                R.drawable.sarjanait,
                "Sarjana TI di Indonesia Masih Sedikit yang Menjadi Programmer ",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry"
            ),
            berita(
                R.drawable.butuh,
                "Jokowi: Indonesia Butuh Lebih Banyak Software Engineer dan Kreator Konten",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry"
            ),
            berita(
                R.drawable.gagal,
                "Ini Sebabnya, Mengapa Banyak Orang Gagal Menjadi Programmer – Jateng Today",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry"
            ),
            berita(
                R.drawable.rekomendasi,
                "Rekomendasi Situs Belajar Coding (Developer) untuk Pemula dan Gratis ",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry"
            ),
            berita(
                R.drawable.menristek,
                "Menristek: Indonesia Butuh Lebih Banyak Programmer | Republika Online",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = beritaAdapter(this, beritalist){
            val intent = Intent(this, DetailBeritaActivity2::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}