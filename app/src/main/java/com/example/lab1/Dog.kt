package com.example.lab1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Dog(
    val name: String,
    val age: Int
):Parcelable
