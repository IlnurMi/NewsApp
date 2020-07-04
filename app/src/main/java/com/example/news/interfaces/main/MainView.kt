package com.example.news.interfaces.main

import com.example.news.interfaces.NavigationFragmentInterface

interface MainView {
    fun initVars()
    fun clickListeners()
    fun addFragment(newInstance: NavigationFragmentInterface)
    fun replaceFragment(newInstance: NavigationFragmentInterface)
}