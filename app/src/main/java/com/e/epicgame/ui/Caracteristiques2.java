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

public class Caracteristiques2 extends AppCompatActivity {
    private EditText mEditTextNiveau2,mEditTextForce2,mEditTextAgilite2, mEditTextIntelligence2;
    private Button mButtonBattle;
    public static final String PREF_SHAREDCARACT2 = "PREF_SHAREDCARACT2";
    public static final String PREF_KEY_VIE2 = "PREF_KEY_VIE2";
    public static final String PREF_KEY_AGILITE2 = "PREF_KEY_AGILTE2";
    public static final String PREF_KEY_FORCE2 = "PREF_KEY_FORCE2";
    public static final String PREF_KEY_INTELLIGENCE2 = "PREF_KEY_INTELLIGENCE2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caracteristiques2);



        mEditTextNiveau2 = findViewById(R.id.activity_caracteristique2_niveauText);
        mEditTextForce2 = findViewById(R.id.activity_caracteristique2_forceText);
        mEditTextAgilite2 = findViewById(R.id.activity_caracteristique2_agiliteText);
        mEditTextIntelligence2 = findViewById(R.id.activity_caracteristique2_intelligenceText);
        mButtonBattle = findViewById(R.id.activity_caracteristique2_buttonBatlle);

        mButtonBattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcul2();
                sendCaracteristique2();

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

    public void calcul2() {
        String n = mEditTextNiveau2.getText().toString();
        String f = mEditTextForce2.getText().toString();
        String a = mEditTextAgilite2.getText().toString();
        String i = mEditTextIntelligence2.getText().toString();

        int nValue = Integer.valueOf(n);
        int fValue = Integer.valueOf(f);
        int aValue = Integer.valueOf(a);
        int iValue = Integer.valueOf(i);

        if (nValue != fValue + aValue + iValue) {
            alert();
        } else {
            Intent BattleActivity = new Intent(Caracteristiques2.this, Battle.class);
            startActivity(BattleActivity);
        }

    }
    public void sendCaracteristique2() {
        String n = mEditTextNiveau2.getText().toString();
        String f = mEditTextForce2.getText().toString();
        String a = mEditTextAgilite2.getText().toString();
        String i = mEditTextIntelligence2.getText().toString();

        int fValue = Integer.valueOf(f);
        int aValue = Integer.valueOf(a);
        int iValue = Integer.valueOf(i);
        int nValue = Integer.valueOf(n);
        int vie = nValue*5;

        SharedPreferences mSharedPreferences = getSharedPreferences(PREF_SHAREDCARACT2, MODE_PRIVATE);
        mSharedPreferences.edit()
        .putInt(PREF_KEY_VIE2, vie)
        .putInt(PREF_KEY_FORCE2,fValue)
        .putInt(PREF_KEY_AGILITE2,aValue)
        .putInt(PREF_KEY_INTELLIGENCE2,iValue)
        .apply();

    }



}
