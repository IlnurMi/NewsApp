package com.example.news.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.news.R
import com.example.news.interfaces.NavigationFragmentInterface
import com.example.news.interfaces.main.MainView
import com.example.news.presenters.main.MainPresenter
import com.example.news.utils.ConstantUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    private val TAG: String = "MainActivity"
    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initVars()
        clickListeners()
    }

    override fun initVars() {
        mainPresenter = MainPresenter()
        mainPresenter.setView(this)
        mainPresenter.initView()
    }

    override fun clickListeners() {
        navigation_menu.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.news_item -> {
                    mainPresenter.navigationItemClick(ConstantUtils.NEWS_FRAGMENT)
                    true
                }
                R.id.games_item -> {
                    mainPresenter.navigationItemClick(ConstantUtils.GAMES_FRAGMENT)
                    true
                }
                R.id.video_item -> {
                    mainPresenter.navigationItemClick(ConstantUtils.VIDEO_FRAGMENT)
                    true
                }
                else -> true
            }
        }
    }

    override fun addFragment(newInstance: NavigationFragmentInterface) {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_main, newInstance as Fragment)
            .commit()
    }

    override fun replaceFragment(newInstance: NavigationFragmentInterface) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_main, newInstance as Fragment)
            .commit()
    }
}
