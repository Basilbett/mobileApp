package com.example.navigationdrawer;

import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
NavigationView navigationView;
DrawerLayout drawerLayout;
ActionBarDrawerToggle drawerToggle;
@Override
public boolean onOptionsItemSelected(@NonNull MenuItem item){
    if(drawerToggle.onOptionsItemSelected(item)){
        return true;
    }
    return super.onOptionsItemSelected(item);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,
                R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(MainActivity.this ,
                                "Home selected",Toast.LENGTH_SHORT).show();
             break;
                }
                switch (item.getItemId()){
                    case R.id.contact:
                        Toast.makeText(MainActivity.this ,
                                "Contact selected",Toast.LENGTH_SHORT).show();
            break;
                }
                switch (item.getItemId()){
                    case R.id.gallery:
                        Toast.makeText(MainActivity.this ,
                                "Gallery selected",Toast.LENGTH_SHORT).show();
               break;
                }


                switch (item.getItemId()){
                    case R.id.about:
                        Toast.makeText(MainActivity.this ,
                                "About  selected",Toast.LENGTH_SHORT).show();
                  break;
                }
                switch (item.getItemId()){
                    case R.id.login:
                        Toast.makeText(MainActivity.this ,
                                "Login selected",Toast.LENGTH_SHORT).show();
                      break;
                }
                switch (item.getItemId()){
                    case R.id.share:
                        Toast.makeText(MainActivity.this ,
                                "Share with a friend",Toast.LENGTH_SHORT).show();
                        break;
                }
                switch (item.getItemId()){
                    case R.id.rateus:
                        Toast.makeText(MainActivity.this ,
                                "Rate the app",Toast.LENGTH_SHORT).show();
                   break;
                }
           return false;
            }
        });
    }
    @Override
    public void onBackPressed(){
    if(drawerLayout.isDrawerOpen(GravityCompat.START))

    {
        drawerLayout.closeDrawer(GravityCompat.START);
    }

    else{
        super.onBackPressed();
    }
    }
}