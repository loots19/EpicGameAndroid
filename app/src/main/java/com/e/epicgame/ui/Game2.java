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

import static com.e.epicgame.ui.Game.PREF_KEY_AVATARGE;
import static com.e.epicgame.ui.Game.PREF_KEY_AVATARMA;
import static com.e.epicgame.ui.Game.PREF_KEY_AVATARRO;
import static com.e.epicgame.ui.Game.PREF_KEY_FIRSTNAME;
import static com.e.epicgame.ui.Game.PREF_SHARED;

public class Game2 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton mButtonMage;
    private ImageButton mButtonGuerrier;
    private ImageButton mButtonRodeur;
    private EditText mNameInput;
    private Button mButtonNext;
    public static final String PREF_KEY_FIRSTNAME2 = "PREF_KEY_FIRSTNAME2";
    public static final String PREF_KEY_AVATARMA2 = "PREF_KEY_AVATAR2";
    public static final String PREF_KEY_AVATARGE2= "PREF_KEY_AVATAR2";
    public static final String PREF_KEY_AVATARRO2 = "PREF_KEY_AVATAR2";
    public static final String PREF_SHARED2 = "PREF_SHARED2";


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
            Toast.makeText(this, "Vous avez choisi le Mage", Toast.LENGTH_SHORT).show();

        } else if (v == mButtonRodeur) {
            saveImageRodeur();
            Toast.makeText(this, "Vous avez choisi le Rodeur", Toast.LENGTH_SHORT).show();

        } else if (v == mButtonNext) {
            mButtonNext.setEnabled(true);
            saveData();
            Intent caracteristique2Activity = new Intent(Game2.this, Caracteristiques2.class);
            startActivity(caracteristique2Activity);

        }

    }

    public void saveData() {
        SharedPreferences mSharedPrefrences = getSharedPreferences(PREF_SHARED2, MODE_PRIVATE);
        mSharedPrefrences.edit().putString(PREF_KEY_FIRSTNAME2, mNameInput.getText().toString()).apply();
    }

    public void saveImageGuerrier() {
        SharedPreferences mSharedPrefrences = getSharedPreferences(PREF_SHARED, MODE_PRIVATE);
        mSharedPrefrences.edit().putInt(PREF_KEY_AVATARGE2, R.drawable.ic_3325766_2196f3).apply();

    }
    public void saveImageMage() {
        SharedPreferences mSharedPrefrences = getSharedPreferences(PREF_SHARED, MODE_PRIVATE);
        mSharedPrefrences.edit().putInt(PREF_KEY_AVATARMA2, R.drawable.ic_1456914).apply();

    }
    public void saveImageRodeur() {
        SharedPreferences mSharedPrefrences = getSharedPreferences(PREF_SHARED, MODE_PRIVATE);
        mSharedPrefrences.edit().putInt(PREF_KEY_AVATARRO2, R.drawable.ic_1676583).apply();
    }
}