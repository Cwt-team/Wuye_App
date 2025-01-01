package com.example.wuyeapp.model

data class Notification(
    val id: Int,
    val title: String,
    val message: String,
    val timestamp: Long
    // 添加其他通知相关字段
)
