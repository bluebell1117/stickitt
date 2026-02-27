package com.example.stikerrli.models

data class StickerListResponse(
    val status: String,
    val message: String,
    val data: List<Sticker>?
)
