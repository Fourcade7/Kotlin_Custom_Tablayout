package com.pr7.kotlin_custom_tablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class NumberAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 10

    override fun createFragment(position: Int): Fragment {

        when(position){
            1->{
                return BlankFragment()
            }
            else->{ return NumberFragment()}
        }
//        fragment.arguments = Bundle().apply {
//            putInt(ARG_OBJECT, position + 1)
//        }

    }
}