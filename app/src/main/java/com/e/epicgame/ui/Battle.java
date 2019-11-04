package com.e.epicgame.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.e.epicgame.R;
import com.e.epicgame.ui.model.Caracter;
import com.e.epicgame.ui.model.Player;
import com.e.epicgame.ui.model.User;

import static com.e.epicgame.ui.Game.PREF_KEY_AVATARGE;
import static com.e.epicgame.ui.Game.PREF_KEY_AVATARMA;
import static com.e.epicgame.ui.Game.PREF_KEY_AVATARRO;
import static com.e.epicgame.ui.Game.PREF_KEY_FIRSTNAME;
import static com.e.epicgame.ui.Game.PREF_SHARED;


public class Battle extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImageView;
    private ImageView mImageView2;
    private TextView mTextViewName;
    private TextView mTextViewName2;
    private Button mButtonAttBasique;
    private Button mButtonAttBasique2;
    private TextView mTextViewResult;
    private TextView mTextViewResult2;
    private Button mButtonAttSpecial;
    private Button mButtonAtSpecial2;
    private Player mPlayer;
    private User mUser;
    private String mfirstname;
    private int mAvatar;


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
        mButtonAtSpecial2 = findViewById(R.id.activity_battle_buttonSpecial2);


        loadData();
        updateView();
        updateViewAvatar();
    }


    @Override
    public void onClick(View v) {
        if (v == mButtonAttBasique) {

        }
        if (v == mButtonAttBasique2) {

        }
        if (v == mButtonAttSpecial) {

        }
        if (v == mButtonAttBasique2) {

        }
    }

    public void loadData() {
        SharedPreferences mSharedPrefenrences = getSharedPreferences(PREF_SHARED, MODE_PRIVATE);
        mfirstname = mSharedPrefenrences.getString(PREF_KEY_FIRSTNAME, "");
        mAvatar = mSharedPrefenrences.getInt(PREF_KEY_AVATARMA, 0);
        mAvatar = mSharedPrefenrences.getInt(PREF_KEY_AVATARGE, 0);
        mAvatar = mSharedPrefenrences.getInt(PREF_KEY_AVATARRO, 0);
    }

    public void updateView() {
        String fullText = " Salut " + mfirstname + " choisi ton attaque ";
        mTextViewName.setText(fullText);
    }

    public void updateViewAvatar() {
        mImageView.setImageResource(mAvatar);
    }


}