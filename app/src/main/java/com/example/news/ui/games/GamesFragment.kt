package com.example.news.ui.games

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.news.R
import com.example.news.interfaces.NavigationFragmentInterface

class GamesFragment:Fragment(), NavigationFragmentInterface {

    private object HOLDER{
        val INSTANCE = GamesFragment()
    }

    companion object{
        val INSTANCE: GamesFragment by lazy { HOLDER.INSTANCE }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.games_fragment, container, false)
    }
}