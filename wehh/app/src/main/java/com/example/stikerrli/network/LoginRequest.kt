package com.example.stikerrli.network

import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("name") val username: String,
    val password: String
)
