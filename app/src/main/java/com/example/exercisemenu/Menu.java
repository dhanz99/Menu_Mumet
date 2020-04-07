package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Menu extends Activity {

    ImageView imageView1, imageView2, imageView3, imageView4, imageView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final Intent toSatu = new Intent(this, LuasPersegi.class);
        final Intent toDua = new Intent(this, KelilingPersegi.class);
        final Intent toTiga = new Intent(this, LuasLingkaran.class);
        final Intent toEmpat = new Intent(this, KelilingLingkaran.class);
        final Intent toLima = new Intent(this, LuasPersegiPjg.class);
        final Intent toEnam = new Intent(this, KelilingPersegiPjg.class);
        final Intent toTuju = new Intent(this, LuasSegitiga.class);
        final Intent toLapan = new Intent(this, KelilingSegitiga.class);
        final Intent toBilan = new Intent(this, LuasTrapesium.class);
        final Intent toPuluh = new Intent(this, KelilingTrapesium.class);




        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(Menu.this, imageView1);
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.satu) {
                            startActivity(toSatu);
                        }
                        if (item.getItemId() == R.id.dua) {
                            startActivity(toDua);
                        }
                        return false;
                    }
                });


                popup.show();
            }


        });

        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(Menu.this, imageView2);
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.satu) {
                            startActivity(toTiga);
                        }
                        if (item.getItemId() == R.id.dua) {
                            startActivity(toEmpat);
                        }
                        return false;
                    }
                });


                popup.show();
            }


        });

        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(Menu.this, imageView3);
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.satu) {
                            startActivity(toLima);
                        }
                        if (item.getItemId() == R.id.dua) {
                            startActivity(toEnam);
                        }
                        return false;
                    }
                });


                popup.show();
            }


        });

        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(Menu.this, imageView4);
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.satu) {
                            startActivity(toTuju);
                        }
                        if (item.getItemId() == R.id.dua) {
                            startActivity(toLapan);
                        }
                        return false;
                    }
                });


                popup.show();
            }


        });

        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(Menu.this, imageView5);
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.satu) {
                            startActivity(toBilan);
                        }
                        if (item.getItemId() == R.id.dua) {
                            startActivity(toPuluh);
                        }
                        return false;
                    }
                });


                popup.show();
            }


        });


    }
}
