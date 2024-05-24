package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        viewPager.setAdapter(new ViewPagerAdapter(this));

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setIcon(R.drawable.hal_chat);
                    break;
                case 1:
                    tab.setIcon(R.drawable.hal_chat);
                    break;
                case 2:
                    tab.setIcon(R.drawable.hal_pembaruan);
                    break;
                case 3:
                    tab.setIcon(R.drawable.hal_komunitas);
                    break;
                case 4:
                    tab.setIcon(R.drawable.hal_panggilan);
            }
        }).attach();
    }
}
