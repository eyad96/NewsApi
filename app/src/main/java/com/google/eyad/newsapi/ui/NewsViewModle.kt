package com.google.eyad.newsapi.ui

import androidx.lifecycle.ViewModel
import com.google.eyad.newsapi.repository.NewsRepository

class NewsViewModle (
    val newsRepository : NewsRepository
) :ViewModel(){

}