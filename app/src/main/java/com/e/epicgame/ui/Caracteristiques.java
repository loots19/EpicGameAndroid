package com.e.epicgame.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.epicgame.R;
import com.e.epicgame.ui.model.Player;

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
                String n = mEditTextNiveau.getText().toString();
                String f = mEditTextForce.getText().toString();
                String a = mEditTextAgilité.getText().toString();
                String i = mEditTextIntelligence.getText().toString();

                float nValue = Float.valueOf(n);
                float fValue = Float.valueOf(f);
                float aValue = Float.valueOf(a);
                float iValue = Float.valueOf(i);


                if (nValue != fValue + aValue + iValue)
                    Toast.makeText(Caracteristiques.this, "attention valeur incorrect", Toast.LENGTH_LONG).show();

                Intent game2Activity = new Intent(Caracteristiques.this, Game2.class);
                startActivity(game2Activity);

            }
        });
    }

}

