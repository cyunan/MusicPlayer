package com.example.musicplayer.ui.page

import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.musicplayer.bridge.MainViewModel
import com.example.musicplayer.bridge.SearchViewModel
import com.example.musicplayer.databinding.FragmentMainBinding
import com.example.musicplayer.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    private var mBinding: FragmentSearchBinding ?= null
    private var mViewModel: SearchViewModel? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}