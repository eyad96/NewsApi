package com.google.eyad.newsapi.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.eyad.newsapi.R
import com.google.eyad.newsapi.ui.NewsActivity
import com.google.eyad.newsapi.ui.NewsViewModle

class BreakingNewsFragment :Fragment(R.layout.fragment_breaking_news){

    lateinit var viewModle :NewsViewModle
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModle = (activity as NewsActivity).viewModle
    }
}