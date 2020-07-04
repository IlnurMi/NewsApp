package com.example.news.ui.video

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.news.R
import com.example.news.interfaces.NavigationFragmentInterface

class VideoFragment: Fragment(), NavigationFragmentInterface {

    private object HOLDER{
        val INSTANCE = VideoFragment()
    }

    companion object{
        val INSTANCE: VideoFragment by lazy { HOLDER.INSTANCE }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.video_fragment, container, false)
    }
}