package com.e.epicgame.ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.e.epicgame.R;

public class Caracteristiques extends AppCompatActivity {

    private EditText mEditTextNiveau,mEditTextForce,mEditTextAgilite,mEditTextIntelligence;
    private Button mButtonFinish;
    public static final String PREF_SHAREDCARACT = "PREF_SHAREDCARACT";
    public static final String PREF_KEY_VIE = "PREF_KEY_VIE";
    public static final String PREF_KEY_AGILITE = "PREF_KEY_AGILTE";
    public static final String PREF_KEY_FORCE = "PREF_KEY_FORCE";
    public static final String PREF_KEY_INTELLIGENCE = "PREF_KEY_INTELLIGENCE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caracteristiques);

        mEditTextNiveau = findViewById(R.id.activity_caracteristique_niveauText);
        mEditTextForce = findViewById(R.id.activity_caracteristique_forceText);
        mEditTextAgilite = findViewById(R.id.activity_caracteristique_agiliteText);
        mEditTextIntelligence = findViewById(R.id.activity_caracteristique_intelligenceText);
        mButtonFinish = findViewById(R.id.activity_caracteristique_buttonFinish);


        mButtonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcul();
                sendCaracteristique();


            }
        });
    }

    private void alert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("resultat!")
                .setMessage("Attention Valeurs incorrect")
                .setPositiveButton("retour choix ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .create()
                .show();

    }

    public void calcul() {
        String n = mEditTextNiveau.getText().toString();
        String f = mEditTextForce.getText().toString();
        String a = mEditTextAgilite.getText().toString();
        String i = mEditTextIntelligence.getText().toString();

        int nValue = Integer.valueOf(n);
        int fValue = Integer.valueOf(f);
        int aValue = Integer.valueOf(a);
        int iValue = Integer.valueOf(i);

        if (nValue != fValue + aValue + iValue) {
            alert();
        } else {
            Intent game2Activity = new Intent(Caracteristiques.this, Game2.class);
            startActivity(game2Activity);
        }

    }
    public void sendCaracteristique() {
        String n = mEditTextNiveau.getText().toString();
        String f = mEditTextForce.getText().toString();
        String a = mEditTextAgilite.getText().toString();
        String i = mEditTextIntelligence.getText().toString();

        int fValue = Integer.valueOf(f);
        int aValue = Integer.valueOf(a);
        int iValue = Integer.valueOf(i);
        int nValue = Integer.valueOf(n);
        int vie = nValue*5;

        SharedPreferences mSharedPreferences = getSharedPreferences(PREF_SHAREDCARACT, MODE_PRIVATE);
        mSharedPreferences.edit()
        .putInt(PREF_KEY_VIE, vie)
        .putInt(PREF_KEY_FORCE,fValue)
        .putInt(PREF_KEY_AGILITE,aValue)
        .putInt(PREF_KEY_INTELLIGENCE,iValue)
        .apply();

    }
}




