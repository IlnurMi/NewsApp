package com.example.news.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.news.R
import com.example.news.interfaces.NavigationFragmentInterface

class NewsFragment: Fragment(),NavigationFragmentInterface{

    private object HOLDER{
        val INSTANCE = NewsFragment()
    }

    companion object{
        val INSTANCE: NewsFragment by lazy { HOLDER.INSTANCE }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.news_fragment, container, false)
    }
}