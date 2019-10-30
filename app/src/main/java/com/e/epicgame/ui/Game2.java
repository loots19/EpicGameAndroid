package com.e.epicgame.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.e.epicgame.R;

public class Game2 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton mButtonMage;
    private ImageButton mButtonGuerrier;
    private ImageButton mButtonRodeur;
    private EditText mNameInput;
    private Button mButtonNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        mButtonGuerrier = findViewById(R.id.activity_game2_buttonGuerrier);
        mButtonMage = findViewById(R.id.activity_game2_buttonMage);
        mButtonRodeur = findViewById(R.id.activity_game2_buttonRodeur);
        mButtonNext = findViewById(R.id.activity_game2_buttonNext);
        mNameInput = findViewById(R.id.activity_game2_nameText);

        mButtonGuerrier.setOnClickListener(this);
        mButtonMage.setOnClickListener(this);
        mButtonRodeur.setOnClickListener(this);
        mButtonNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == mButtonGuerrier) {
            Toast.makeText(this, "Vous avez choisi le Guerrier", Toast.LENGTH_SHORT).show();


        } else if (v == mButtonMage) {
            Toast.makeText(this, "Vous avez choisi le Mage", Toast.LENGTH_LONG).show();

        } else if (v == mButtonRodeur) {
            Toast.makeText(this, "Vous avez choisi le Rodeur", Toast.LENGTH_LONG).show();

        } else if (v == mButtonNext) {
            String firstname = mNameInput.getText().toString();
            Intent battleIntent = new Intent(this, Battle.class);
            battleIntent.putExtra("name", firstname);

            Intent caracteristique2Activity = new Intent(Game2.this, Caracteristiques2.class);
            startActivity(caracteristique2Activity);

        }

    }

}