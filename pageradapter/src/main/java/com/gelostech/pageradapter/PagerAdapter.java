package com.gelostech.pageradapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragments = new ArrayList<>();
    List<String> titles = new ArrayList<>();
    Context context;

    public PagerAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context = context;
    }

    public void addTitle(String title){
        titles.add(title);
    }

    public void addFragment(Fragment fragment){
        fragments.add(fragment);
    }

    public void addFragment(Fragment fragment,String title){
        fragments.add(fragment);
        titles.add(title.toUpperCase());
    }

    public void addAllFragments(Fragment... frag){
        fragments.addAll(Arrays.asList(frag));
    }

    public void addAllTitles(String... title){
        titles.addAll(Arrays.asList(title));
    }

    public void removeFragment(int i){
        fragments.remove(i);
        titles.remove(i);
        notifyDataSetChanged();
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


}