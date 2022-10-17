package com.example.musicplayer.ui.page

import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.musicplayer.bridge.MainViewModel
import com.example.musicplayer.bridge.PlayerViewModel
import com.example.musicplayer.databinding.FragmentMainBinding
import com.example.musicplayer.databinding.FragmentPlayerBinding

class PlayerFragment : Fragment() {
    private var mBinding: FragmentPlayerBinding ?= null
    private var mViewModel: PlayerViewModel? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}