package com.example.stikerrli.models

data class OrderDetailResponse(
    val success: Boolean,
    val message: String,
    val data: OrderDetails
)

data class OrderDetails(
    val id: Int,
    val status: String,
    val total_price: Int,
    val created_at: String,
    val items: List<OrderItem>
)
