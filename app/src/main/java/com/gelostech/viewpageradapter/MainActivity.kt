package com.gelostech.viewpageradapter


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gelostech.pageradapter.PagerAdapter
import com.gelostech.viewpageradapter.fragments.FragmentOne
import com.gelostech.viewpageradapter.fragments.FragmentThree
import com.gelostech.viewpageradapter.fragments.FragmentTwo
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        setSupportActionBar(toolbar)

        val adapter = PagerAdapter(supportFragmentManager, this)
        adapter.addFragment(FragmentOne(), "ONE")
        adapter.addFragment(FragmentTwo(), "TWO")
        adapter.addFragment(FragmentThree(), "THREE")
        viewpager.adapter = adapter

        tabs.setupWithViewPager(viewpager)
        viewpager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))

        tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {

            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }

            override fun onTabSelected(p0: TabLayout.Tab?) {

            }
        })
    }
}
