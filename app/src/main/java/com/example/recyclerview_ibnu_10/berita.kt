package com.example.recyclerview_ibnu_10

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class berita(
    val imageBerita: Int,
    val judulBerita: String,
    val deskripsi: String
):Parcelable
