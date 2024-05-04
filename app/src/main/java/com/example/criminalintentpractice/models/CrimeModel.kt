package com.example.criminalintentpractice.models

import java.util.Date
import java.util.UUID

data class CrimeModel(
    val id: UUID = UUID.randomUUID(),
    val title: String = "",
    val date: Date = Date(),
    var solved: Boolean = false
) {

}