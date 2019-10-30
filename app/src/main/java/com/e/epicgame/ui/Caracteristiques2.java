package com.e.epicgame.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.e.epicgame.R;

public class Caracteristiques2 extends AppCompatActivity {
    private EditText mEditTextNiveau2;
    private EditText mEditTextForce2;
    private EditText mEditTextAgilité2;
    private EditText mEditTextIntelligence2;
    private Button mButtonBattle;
    private SharedPreferences mPreferences;
    public static final String PREF_KEY_FIRSTNAME = "PREF_KEY_FIRSTNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caracteristiques2);

        mPreferences = getPreferences(MODE_PRIVATE);

        mEditTextNiveau2 = findViewById(R.id.activity_caracteristique2_niveauText);
        mEditTextForce2 = findViewById(R.id.activity_caracteristique2_forceText);
        mEditTextAgilité2 = findViewById(R.id.activity_caracteristique2_agiliteText);
        mEditTextIntelligence2 = findViewById(R.id.activity_caracteristique2_intelligenceText);
        mButtonBattle = findViewById(R.id.activity_caracteristique2_buttonBatlle);

        mButtonBattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BattleActivity = new Intent(Caracteristiques2.this, Battle.class);
                startActivity(BattleActivity);
            }
        });


    }



}
