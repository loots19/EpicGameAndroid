package com.e.epicgame.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.e.epicgame.R;
import com.e.epicgame.ui.model.Caracter;
import com.e.epicgame.ui.model.Player;

public class Game extends AppCompatActivity implements View.OnClickListener {

    private ImageButton mButtonMage;
    private ImageButton mButtonGuerrier;
    private ImageButton mButtonRodeur;
    private EditText mNameInput;
    private Button mButtonNext;
    private Player mPlayer;
    private SharedPreferences mPreferences;
    private Caracter mCaracter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mPreferences = getPreferences(MODE_PRIVATE);

        mButtonGuerrier = findViewById(R.id.activity_game_buttonGuerrier);
        mButtonMage = findViewById(R.id.activity_game_buttonMage);
        mButtonRodeur = findViewById(R.id.activity_game_buttonRodeur);
        mButtonNext = findViewById(R.id.activity_game_buttonNext);
        mNameInput = findViewById(R.id.activity_game_nameText);

        mButtonGuerrier.setOnClickListener(this);
        mButtonMage.setOnClickListener(this);
        mButtonRodeur.setOnClickListener(this);
        mButtonNext.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v == mButtonGuerrier) {
        int image = R.drawable.ic_3325766_2196f3;
        Intent battleIntent = new Intent(this,Battle.class);
        battleIntent.putExtra("Avatar",image);
            Toast.makeText(this, "Vous avez choisi" , Toast.LENGTH_SHORT).show();


        } else if (v == mButtonMage) {
            Toast.makeText(this, "Vous avez choisi le Mage", Toast.LENGTH_LONG).show();

        } else if (v == mButtonRodeur) {
            Toast.makeText(this, "Vous avez choisi le Rodeur", Toast.LENGTH_LONG).show();


        } else if (v == mButtonNext) {
            String firstname = mNameInput.getText().toString();
            Intent battleIntent = new Intent(this, Battle.class);
            battleIntent.putExtra("name", firstname);


            Intent caracteristiqueActivity = new Intent(this, Caracteristiques.class);
            startActivity(caracteristiqueActivity);


        }

    }



}







