package oop_126847_ZahraAriestya.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)