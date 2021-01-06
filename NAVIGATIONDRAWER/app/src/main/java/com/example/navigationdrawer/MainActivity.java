package com.example.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import info.hoang8f.android.segmented.SegmentedGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SegmentedGroup group=findViewById(R.id.segmented2);
        group.setTintColor(Color.parseColor("#FF7538"), Color.parseColor("#000000"));

        Toolbar tb1 = findViewById(R.id.tb);
        LinearLayout ll= findViewById(R.id.LL);


        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withIcon(R.drawable.ic_baseline_home_24).withName("Home");
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(2).withIcon(R.drawable.ic_baseline_language_24).withName("Settings");
        SecondaryDrawerItem item3 = new SecondaryDrawerItem().withIdentifier(3).withIcon(R.drawable.ic_baseline_library_add_24).withName("Storage");

        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(tb1)
                .addDrawerItems(
                        item1,
                        item2,
                        new DividerDrawerItem(),
                        item3
                ).withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                        if(drawerItem.getIdentifier() ==1){
                            Toast.makeText(MainActivity.this, "Cliked on Home " , Toast.LENGTH_SHORT).show();

                            Snackbar.make(ll,"Are you sure?",Snackbar.LENGTH_LONG).setAction("UNDO", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                }
                            }).show();

                        }


                        else if(drawerItem.getIdentifier() ==2){
                            Toast.makeText(MainActivity.this, "Cliked on Settings " , Toast.LENGTH_SHORT).show();

                            Snackbar.make(ll,"Are you sure?",Snackbar.LENGTH_LONG).setAction("UNDO", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                }
                            }).show();

                        }


                        else if(drawerItem.getIdentifier() ==3){
                            Toast.makeText(MainActivity.this, "Cliked on Storge " , Toast.LENGTH_SHORT).show();
                            Snackbar.make(ll,"Are you sure?",Snackbar.LENGTH_LONG).setAction("UNDO", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                }
                            }).show();
                        }


                        return true;
                    }
                })

                .build();
    }
    }
