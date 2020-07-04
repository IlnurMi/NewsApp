package com.example.news.presenters.main

import com.example.news.interfaces.main.MainView
import com.example.news.ui.games.GamesFragment
import com.example.news.ui.news.NewsFragment
import com.example.news.ui.video.VideoFragment
import com.example.news.utils.ConstantUtils

class MainPresenter {
    private lateinit var mainView: MainView

    fun setView(view: MainView) {
        this.mainView = view
    }

    fun initView(){
        mainView.addFragment(NewsFragment.INSTANCE)
    }

    fun navigationItemClick(item: Int) {
        when (item) {
            ConstantUtils.NEWS_FRAGMENT -> mainView.replaceFragment(NewsFragment.INSTANCE)
            ConstantUtils.GAMES_FRAGMENT -> mainView.replaceFragment(GamesFragment.INSTANCE)
            ConstantUtils.VIDEO_FRAGMENT -> mainView.replaceFragment(VideoFragment.INSTANCE)
        }
    }
}