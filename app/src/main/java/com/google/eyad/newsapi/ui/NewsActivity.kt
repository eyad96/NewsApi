package com.google.eyad.newsapi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.eyad.newsapi.R
import com.google.eyad.newsapi.db.ArticalDataBase
import com.google.eyad.newsapi.repository.NewsRepository
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {

    lateinit var viewModle:NewsViewModle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val newsRepository = NewsRepository(ArticalDataBase(this))
        val viewModleProviderFactory = NewsViewModleProviderFactory(newsRepository)
        viewModle = ViewModelProvider (this , viewModleProviderFactory).get(NewsViewModle::class.java)

        bottomAppBar.setupWithNavController(fragment.findNavController())

    }
}