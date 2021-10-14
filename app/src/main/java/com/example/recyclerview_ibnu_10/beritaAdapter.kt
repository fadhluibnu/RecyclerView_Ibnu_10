package com.example.recyclerview_ibnu_10

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessControlContext
import java.util.*

class beritaAdapter(private val context: Context, private val berita: List<berita>, val listener: (berita) -> Unit)
    : RecyclerView.Adapter<beritaAdapter.beritaViewHolder>(){
        class beritaViewHolder(view: View): RecyclerView.ViewHolder(view){

            val imageBerita = view.findViewById<ImageView>(R.id.img_item_photo)
            val judulBerita = view.findViewById<TextView>(R.id.tv_item_name)
            val desBerita = view.findViewById<TextView>(R.id.tv_item_description)
            fun bindView(berita: berita, listener: (berita) -> Unit){
                imageBerita.setImageResource(berita.imageBerita)
                judulBerita.text = berita.judulBerita
                desBerita.text = berita.deskripsi
                itemView.setOnClickListener{
                    listener(berita)
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): beritaViewHolder {
        return beritaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_berita, parent, false)
        )
    }

    override fun onBindViewHolder(holder: beritaViewHolder, position: Int) {
       holder.bindView(berita[position], listener)
    }

    override fun getItemCount(): Int = berita.size
}