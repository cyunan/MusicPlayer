package com.example.musicplayer.ui.page

import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.musicplayer.bridge.MainViewModel
import com.example.musicplayer.databinding.FragmentMainBinding

class DrawerFragment : Fragment() {
    private var mainBinding: FragmentMainBinding ?= null
    private var mainViewModel: MainViewModel? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}