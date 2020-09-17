package com.google.eyad.newsapi.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.google.eyad.newsapi.repository.NewsRepository

class NewsViewModleProviderFactory(
    val newsRepository: NewsRepository
)
    :ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModle(newsRepository) as T
    }

}