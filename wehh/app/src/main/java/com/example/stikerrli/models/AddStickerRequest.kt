package com.example.stikerrli.models

import com.google.gson.annotations.SerializedName

data class AddStickerRequest(
    val name: String,
    val price: Int,
    @SerializedName("category_id") val categoryId: Int,
    @SerializedName("image_url") val imageUrl: String 
)
