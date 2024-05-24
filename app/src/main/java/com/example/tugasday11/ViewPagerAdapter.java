package com.example.tugasday11;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ChatFragment();
            case 1:
                return new ChatActivity();
            case 2:
                return new StatusFragment();
            case 3:
                return new CommunityFragment();
            case 4:
                return new CallsFragment();
            default:
                return new ChatFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
