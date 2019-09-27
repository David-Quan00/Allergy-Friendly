package com.example.david.allergychecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {



    private Button btn_SelectAllergy;
    private Button btn_Credits;
    private Button btn_About;
    private Button btn_SearchRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Credits = (Button) findViewById(R.id.btn_Credits);
        btn_Credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCredits();

            }
        });

        btn_SelectAllergy = (Button) findViewById(R.id.btn_SelectAllergy);
        btn_SelectAllergy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                openSelectAllergy();
            }
            }
        );

        btn_About = (Button) findViewById(R.id.btn_About);
        btn_About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAbout();

            }
        });


        btn_SearchRecipe = (Button) findViewById(R.id.btn_SearchRecipe);
        btn_SearchRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearchRecipe();

            }
        });
    }



    public void openCredits(){
        Intent intent = new Intent(this, credits2.class);
        startActivity(intent);
    }

    public void openSelectAllergy(){
        Intent intent = new Intent(this, select_Allergy.class);
        startActivity(intent);
    }

    public void openAbout(){
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void openSearchRecipe(){
        Intent intent = new Intent(this, SearchRecipe.class);
        startActivity(intent);
    }
}

