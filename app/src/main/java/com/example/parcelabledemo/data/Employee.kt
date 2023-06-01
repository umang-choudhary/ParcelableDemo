package com.example.parcelabledemo.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Employee(val id: Int, val fullName: String, val ctc: Double) : Parcelable
