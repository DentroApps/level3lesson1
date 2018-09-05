package ru.dentro.geekbrains.levelthreelessonone.model;

import android.support.v4.app.Fragment;

import ru.dentro.geekbrains.levelthreelessonone.R;
import ru.dentro.geekbrains.levelthreelessonone.view.FavoriteFragment;
import ru.dentro.geekbrains.levelthreelessonone.view.HomeFragment;
import ru.dentro.geekbrains.levelthreelessonone.view.SearchFragment;

public class FragmentHolder {

    private Fragment currentFragment;

    public void setCurrentFragment(int resId){
        switch (resId){
            case R.id.nav_home:
                currentFragment = new HomeFragment();
                break;
            case R.id.nav_search:
                currentFragment = new SearchFragment();
                break;
            case R.id.nav_favorite:
                currentFragment = new FavoriteFragment();
                break;
        }
    }

    public Fragment getCurrentFragment(){
        return currentFragment;
    }

}
