package com.pr7.kotlin_custom_tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var adapter: NumberAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //init
        tabLayout = findViewById(R.id.tab_layout)
        viewPager = findViewById(R.id.viewpager)


        val tabNames: Array<String> = arrayOf(
            "Первый",
            "Второй",
            "Третий",
            "Четвертый",
            "Пятый",
            "Шестой",
            "Седьмой",
            "Восьмой",
            "Девятый",
            "Десятый",
        )
        val tabImages: Array<Int> = arrayOf(
            R.drawable.ic_baseline_home_24,
            R.drawable.ic_baseline_home_24,
            R.drawable.ic_baseline_home_24,
            R.drawable.ic_baseline_home_24,
            R.drawable.ic_baseline_home_24,
            R.drawable.ic_baseline_home_24,
            R.drawable.ic_baseline_home_24,
            R.drawable.ic_baseline_home_24,
            R.drawable.ic_baseline_home_24,
            R.drawable.ic_baseline_home_24,
        )

        adapter = NumberAdapter(this@MainActivity)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = tabNames[position]
            tab.setIcon(tabImages.get(position))

            if (position == 2) {
                val badge = tab.getOrCreateBadge()
                badge.number = 1
            }

        }.attach()




    }
}