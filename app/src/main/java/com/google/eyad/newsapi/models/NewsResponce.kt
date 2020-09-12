package com.google.eyad.newsapi.models

import com.google.eyad.newsapi.models.Article

data class NewsResponce(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)