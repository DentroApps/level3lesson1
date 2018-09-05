package ru.dentro.geekbrains.levelthreelessonone.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import ru.dentro.geekbrains.levelthreelessonone.R;
import ru.dentro.geekbrains.levelthreelessonone.presenter.FragmentSetter;

public class MainActivity extends AppCompatActivity implements
                                        BottomNavigationView.OnNavigationItemSelectedListener,
                                        FragmentSetter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    @Override
    public void setFragment(Fragment fragment) {

    }
}
