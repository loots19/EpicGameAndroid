package com.e.epicgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Caracteristiques extends AppCompatActivity {
    private EditText mEditTextNiveau;
    private EditText mEditTextForce;
    private EditText mEditTextAgilité;
    private EditText mEditTextIntelligence;
    private Button mButtonFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caracteristiques);

        mEditTextNiveau = findViewById(R.id.activity_caracteristique_niveauText);
        mEditTextForce = findViewById(R.id.activity_caracteristique_forceText);
        mEditTextAgilité = findViewById(R.id.activity_caracteristique_agiliteText);
        mEditTextIntelligence = findViewById(R.id.activity_caracteristique_intelligenceText);
        mButtonFinish = findViewById(R.id.activity_caracteristique_buttonFinish);

        mButtonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent game2Activity = new Intent(Caracteristiques.this,Game2.class);
                startActivity(game2Activity);
            }
        });
    }
}
