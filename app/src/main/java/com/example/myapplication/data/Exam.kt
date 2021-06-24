package com.example.myapplication.data
import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Exam(var name: String?, var score: Int, var grade: String?) : Parcelable