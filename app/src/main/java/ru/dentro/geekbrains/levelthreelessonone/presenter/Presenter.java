package ru.dentro.geekbrains.levelthreelessonone.presenter;

import ru.dentro.geekbrains.levelthreelessonone.model.FragmentHolder;

public class Presenter {

    private FragmentHolder fHolder;
    private FragmentSetter fSetter;

    public Presenter (FragmentSetter fSetter){
        this.fSetter = fSetter;
        this.fHolder = new FragmentHolder();
    }

    public void selectItem(int resId){
        fHolder.setCurrentFragment(resId);
        fSetter.setFragment(fHolder.getCurrentFragment());
    }
}
