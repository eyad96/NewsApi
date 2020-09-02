package com.google.eyad.newsapi.apiresponce

data class NewsResponce(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)