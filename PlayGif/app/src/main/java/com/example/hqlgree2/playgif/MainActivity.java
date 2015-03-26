package com.example.hqlgree2.playgif;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

/**
 * Main activity, hosts the pager
 *
 * @author koral--
 */
public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((ViewPager) findViewById(R.id.main_pager)).setAdapter(new MainPagerAdapter(this));
    }

    static class MainPagerAdapter extends FragmentStatePagerAdapter {
        private final String[] mPageTitles;

        public MainPagerAdapter(FragmentActivity act) {
            super(act.getSupportFragmentManager());
            mPageTitles = act.getResources().getStringArray(R.array.pages);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new GifSourcesFragment();
                case 1:
                    return new GifTextViewFragment();
                case 2:
                    return new GifTextureFragment();
                case 3:
                    return new AboutFragment();
                default:
                    throw new IndexOutOfBoundsException("Invalid page index");
            }
        }

        @Override
        public int getCount() {
            return mPageTitles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mPageTitles[position];
        }
    }

}
