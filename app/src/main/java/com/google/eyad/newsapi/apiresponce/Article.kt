package com.google.eyad.newsapi.apiresponce

import androidx.room.Entity

@Entity(
    tableName = "artical"
)

data class Article(
    val id :Int? = null ,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
)