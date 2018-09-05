package ru.dentro.geekbrains.levelthreelessonone.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import ru.dentro.geekbrains.levelthreelessonone.R;
import ru.dentro.geekbrains.levelthreelessonone.presenter.FragmentSetter;
import ru.dentro.geekbrains.levelthreelessonone.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements
                                        BottomNavigationView.OnNavigationItemSelectedListener,
                                        FragmentSetter {
    private Presenter presenter;
    private BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(this);

        presenter = new Presenter(this);
        presenter.selectItem(R.id.nav_home);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        presenter.selectItem(item.getItemId());
        return true;
    }

    @Override
    public void setFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }
}
