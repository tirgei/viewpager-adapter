package com.gelostech.pageradapter;

import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 *  The PagerAdapter class
 */
public class PagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragments = new ArrayList<>();
    List<String> titles = new ArrayList<>();
    Context context;

    /**
     *  Constructor for the PagerAdapter class
     * @param fm - Fragment manager
     * @param context - Context
     */
    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    /**
     * Add a title for the ViewPager tab
     * @param title - Tab title
     */
    public void addTitle(String title){
        titles.add(title);
    }

    /**
     * Add a Fragment to the ViewPager
     * @param fragment - Instance of the fragment
     */
    public void addFragment(Fragment fragment){
        fragments.add(fragment);
    }

    /**
     * Add a Fragment to the ViewPager
     * @param fragment - Instance of the Fragment
     * @param title - Title of the Tab
     */
    public void addFragment(Fragment fragment,String title){
        fragments.add(fragment);
        titles.add(title.toUpperCase());
    }

    /**
     * Add several Fragments
     * @param frag - Array of fragments
     */
    public void addAllFragments(Fragment... frag){
        fragments.addAll(Arrays.asList(frag));
    }

    /**
     * Add several titles
     * @param title - Array of titles
     */
    public void addAllTitles(String... title){
        titles.addAll(Arrays.asList(title));
    }

    /**
     * Remove Fragment using index
     * @param index - Index of the Fragment
     */
    public void removeFragment(int index){
        fragments.remove(index);
        titles.remove(index);
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
