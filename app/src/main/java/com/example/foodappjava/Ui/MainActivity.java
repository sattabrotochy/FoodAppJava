package com.example.foodappjava.Ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.foodappjava.Gallery.DailyMealFragment;
import com.example.foodappjava.Home.HomeFragment;
import com.example.foodappjava.R;
import com.example.foodappjava.SlidShow.FavouriteFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ActionBarDrawerToggle barDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewBinding();



        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.home){
                    loadFragment(new HomeFragment());
                    Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_SHORT).show();

                } else if (id == R.id.dailyMeal) {
                    loadFragment(new DailyMealFragment());
                } else if (id == R.id.favourite) {
                    loadFragment(new FavouriteFragment());
                }else if (id == R.id.My_Order) {
                    //loadFragment(new Homeragment());
                }else  {
                   // loadFragment(new Homeragment());
                }


                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });


    }

    private void loadFragment(Fragment fragment) {

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main_content,fragment);
        fragmentTransaction.commit();
    }

    private void viewBinding() {
        drawerLayout =findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.navigation_Drawer);
        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        barDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.Open_Drawer,R.string.Close_Drawer);
        drawerLayout.addDrawerListener(barDrawerToggle);
        barDrawerToggle.syncState();
        loadFragment(new HomeFragment());
    }

    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }

    }
}