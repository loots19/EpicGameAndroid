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
import com.e.epicgame.ui.model.User;

public class Game extends AppCompatActivity implements View.OnClickListener {

    private ImageButton mButtonMage;
    private ImageButton mButtonGuerrier;
    private ImageButton mButtonRodeur;
    private EditText mNameInput;
    private Button mButtonNext;
    private Player mPlayer;
    private User mUser;
    private Caracter mCaracter;
    public static final String PREF_KEY_FIRSTNAME = "PREF_KEY_FIRSTNAME";
    public static final String PREF_KEY_AVATARMA = "PREF_KEY_AVATARMA";
    public static final String PREF_KEY_AVATARGE = "PREF_KEY_AVATARGE";
    public static final String PREF_KEY_AVATARRO = "PREF_KEY_AVATARRO";
    public static final String PREF_SHARED = "PREF_SHARED";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        mButtonGuerrier = findViewById(R.id.activity_game_buttonGuerrier);
        mButtonMage = findViewById(R.id.activity_game_buttonMage);
        mButtonRodeur = findViewById(R.id.activity_game_buttonRodeur);
        mButtonNext = findViewById(R.id.activity_game_buttonNext);
        mNameInput = findViewById(R.id.activity_game_nameText);

        mButtonGuerrier.setOnClickListener(this);
        mButtonMage.setOnClickListener(this);
        mButtonRodeur.setOnClickListener(this);
        mButtonNext.setOnClickListener(this);


        mButtonNext.setEnabled(false);


        mNameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mButtonNext.setEnabled(s.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }


    @Override
    public void onClick(View v) {
        if (v == mButtonGuerrier) {
            saveImageGuerrier();
            Toast.makeText(this, "Vous avez choisi le Guerrier", Toast.LENGTH_SHORT).show();

        } else if (v == mButtonMage) {
            saveImageMage();

            Toast.makeText(this, "Vous avez choisi le Mage", Toast.LENGTH_LONG).show();

        } else if (v == mButtonRodeur) {
            saveImageRodeur();
            Toast.makeText(this, "Vous avez choisi le Rodeur", Toast.LENGTH_LONG).show();


        } else if (v == mButtonNext) {
            mButtonNext.setEnabled(true);
            saveData();

            Intent caracteristiqueActivity = new Intent(this, Caracteristiques.class);
            startActivity(caracteristiqueActivity);

        }
    }

    public void saveData() {
        SharedPreferences mSharedPrefrences = getSharedPreferences(PREF_SHARED, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPrefrences.edit();
        editor.putString(PREF_KEY_FIRSTNAME, mNameInput.getText().toString());
        editor.apply();
    }

    public void saveImageMage() {
        SharedPreferences mSharedPrefrences = getSharedPreferences(PREF_SHARED, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPrefrences.edit();
        editor.putInt(PREF_KEY_AVATARMA, R.drawable.ic_1456914);
        editor.apply();

    }

    public void saveImageGuerrier() {
        SharedPreferences mSharedPrefrences = getSharedPreferences(PREF_SHARED, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPrefrences.edit();
        editor.putInt(PREF_KEY_AVATARGE, R.drawable.ic_3325766_2196f3);
        editor.apply();

    }

    public void saveImageRodeur() {
        SharedPreferences mSharedPrefrences = getSharedPreferences(PREF_SHARED, MODE_PRIVATE);
        SharedPreferences.Editor editor = mSharedPrefrences.edit();
        editor.putInt(PREF_KEY_AVATARRO, R.drawable.ic_1676583);
        editor.apply();
    }

}





