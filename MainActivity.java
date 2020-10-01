package com.example.nicknamegeneradorpro1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Spinner;

import com.example.nicknamegeneradorpro1.R;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    ImageView option;
    Spinner spinner1, spinner2, spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(MainActivity.this, v);
                popup.setOnMenuItemClickListener(MainActivity.this);
                popup.inflate(R.menu.menu_main);
                popup.show();
            }
        });
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.spiner_1, R.a)
    }

    public void init(){
        option      =   findViewById(R.id.img_option);
        spinner1    =   findViewById(R.id.spinner1);
        spinner2    =   findViewById(R.id.spinner2);
        spinner3    =   findViewById(R.id.spinner3);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_privacy:

                break;
            case R.id.menu_app:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + "nickname.generator.free&fbclid=IwAR1SLSkKhmjOqTSJ88AnK6tpF8ML4_OCwlwoREM5eqdPwfPwTQI23K2JVp0")));
                break;
        }
        return false;
    }
}