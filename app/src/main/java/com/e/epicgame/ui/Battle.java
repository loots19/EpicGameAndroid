package com.e.epicgame.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.e.epicgame.R;

import static com.e.epicgame.ui.Caracteristiques.PREF_KEY_AGILITE;
import static com.e.epicgame.ui.Caracteristiques.PREF_KEY_FORCE;
import static com.e.epicgame.ui.Caracteristiques.PREF_KEY_INTELLIGENCE;
import static com.e.epicgame.ui.Caracteristiques.PREF_KEY_VIE;
import static com.e.epicgame.ui.Caracteristiques.PREF_SHAREDCARACT;
import static com.e.epicgame.ui.Caracteristiques2.PREF_KEY_AGILITE2;
import static com.e.epicgame.ui.Caracteristiques2.PREF_KEY_FORCE2;
import static com.e.epicgame.ui.Caracteristiques2.PREF_KEY_INTELLIGENCE2;
import static com.e.epicgame.ui.Caracteristiques2.PREF_KEY_VIE2;
import static com.e.epicgame.ui.Caracteristiques2.PREF_SHAREDCARACT2;
import static com.e.epicgame.ui.Game.PREF_KEY_AVATARGE;
import static com.e.epicgame.ui.Game.PREF_KEY_AVATARMA;
import static com.e.epicgame.ui.Game.PREF_KEY_AVATARRO;
import static com.e.epicgame.ui.Game.PREF_KEY_FIRSTNAME;
import static com.e.epicgame.ui.Game.PREF_SHARED;
import static com.e.epicgame.ui.Game2.PREF_KEY_AVATARGE2;
import static com.e.epicgame.ui.Game2.PREF_KEY_AVATARMA2;
import static com.e.epicgame.ui.Game2.PREF_KEY_AVATARRO2;
import static com.e.epicgame.ui.Game2.PREF_KEY_FIRSTNAME2;
import static com.e.epicgame.ui.Game2.PREF_SHARED2;


public class Battle extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImageView, mImageView2;
    private TextView mTextViewName, mTextViewName2;
    private Button mButtonAttBasique, mButtonAttBasique2;
    private TextView mTextViewResult, mTextViewResult2;
    private Button mButtonAttSpecial, mButtonAttSpecial2;
    private String mfirstname;
    private String mfirstname1;
    private int mAvatar, mAvatar2, mVie, mForce, mAgilite, mIntelligence, mVie2, mForce2, mAgilite2, mIntelligence2, mP;
    public static final String PREF_KEY_RESULT = "PREF_KEY_RESULT";
    public static final String PREF_KEY_RESULT2 = "PREF_KEY_RESULT2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);


        mImageView = findViewById(R.id.activity_battle_imageCaract);
        mImageView2 = findViewById(R.id.activity_battle_imageCaract2);
        mTextViewName = findViewById(R.id.activity_battle_nameText);
        mTextViewName2 = findViewById(R.id.activity_battle_nameText2);
        mButtonAttBasique = findViewById(R.id.activity_battle_buttonBasique);
        mButtonAttBasique2 = findViewById(R.id.activity_battle_buttonBasique2);
        mTextViewResult = findViewById(R.id.activity_battle_resultText);
        mTextViewResult2 = findViewById(R.id.activity_battle_resultText2);
        mButtonAttSpecial = findViewById(R.id.activity_battle_buttonSpecial);
        mButtonAttSpecial2 = findViewById(R.id.activity_battle_buttonSpecial2);

        mButtonAttBasique.setOnClickListener(this);
        mButtonAttBasique2.setOnClickListener(this);
        mButtonAttSpecial.setOnClickListener(this);
        mButtonAttSpecial2.setOnClickListener(this);


        loadData();
        updateView();
        updateViewAvatar();

    }


    @Override
    public void onClick(View v) {

        if (v == mButtonAttBasique) {
            attBasiqueGuerrier();

        }


        if (v == mButtonAttBasique2) {
            attBasiqueGuerrier1();

        }


        if (v == mButtonAttSpecial) {

        }
        if (v == mButtonAttBasique2) {

        }
    }

    public void loadData() {
        SharedPreferences mSharedPreferences = getSharedPreferences(PREF_SHARED, MODE_PRIVATE);
        mfirstname = mSharedPreferences.getString(PREF_KEY_FIRSTNAME, "");
        mAvatar = mSharedPreferences.getInt(PREF_KEY_AVATARMA, 0);
        mAvatar = mSharedPreferences.getInt(PREF_KEY_AVATARGE, 0);
        mAvatar = mSharedPreferences.getInt(PREF_KEY_AVATARRO, 0);

        SharedPreferences mSharedPreferences2 = getSharedPreferences(PREF_SHARED2, MODE_PRIVATE);
        mfirstname1 = mSharedPreferences2.getString(PREF_KEY_FIRSTNAME2, "");
        mAvatar2 = mSharedPreferences.getInt(PREF_KEY_AVATARMA2, 0);
        mAvatar2 = mSharedPreferences.getInt(PREF_KEY_AVATARGE2, 0);
        mAvatar2 = mSharedPreferences.getInt(PREF_KEY_AVATARRO2, 0);

        SharedPreferences mSharedPreferencesCaract = getSharedPreferences(PREF_SHAREDCARACT, MODE_PRIVATE);
        mVie = mSharedPreferencesCaract.getInt(PREF_KEY_VIE, 0);
        mForce = mSharedPreferencesCaract.getInt(PREF_KEY_FORCE, 0);
        mAgilite = mSharedPreferencesCaract.getInt(PREF_KEY_AGILITE, 0);
        mIntelligence = mSharedPreferencesCaract.getInt(PREF_KEY_INTELLIGENCE, 0);

        SharedPreferences mSharedPreferencesCaract2 = getSharedPreferences(PREF_SHAREDCARACT2, MODE_PRIVATE);
        mVie2 = mSharedPreferencesCaract2.getInt(PREF_KEY_VIE2, 0);
        mForce2 = mSharedPreferencesCaract2.getInt(PREF_KEY_FORCE2, 0);
        mAgilite2 = mSharedPreferencesCaract2.getInt(PREF_KEY_AGILITE2, 0);
        mIntelligence2 = mSharedPreferencesCaract2.getInt(PREF_KEY_INTELLIGENCE2, 0);

    }

    public void updateView() {
        String fullText = " Salut " + mfirstname + " tu possède " + mVie + " de vie, " + " choisi ton attaque ";
        mTextViewName.setText(fullText);
        String fullText1 = "Salut " + mfirstname1 + " tu possède " + mVie2 + " de vie, " + " choisi ton attaque ";
        mTextViewName2.setText(fullText1);
    }

    public void updateViewAvatar() {
        mImageView.setImageResource(mAvatar);
        mImageView2.setImageResource(mAvatar2);

    }

    public void attBasiqueGuerrier() {
        int dommages = mForce;
        int player2 = mVie2 - dommages;
        String textResult = mfirstname1 + " il te reste " + player2 + " de vie ";
        mTextViewResult2.setText(textResult);

        }


    public void attBasiqueGuerrier1() {

        int mP = mVie - mForce2;
        String textResult = mfirstname + " il te reste " + mP + " de vie ";
        mTextViewResult.setText(textResult);

    }


}






