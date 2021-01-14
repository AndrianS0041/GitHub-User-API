package com.andrian.githubuserapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.apply {
            elevation = 0f
            title = ""
        }
        detailPager.adapter = PagerAdapter(supportFragmentManager)
        detailTab.setupWithViewPager(detailPager)
    }
}

class MyPagerAdapter(supportFragmentManager: FragmentManager) {

}
