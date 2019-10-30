package com.e.epicgame.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.e.epicgame.R;
import com.e.epicgame.ui.model.Caracter;
import com.e.epicgame.ui.model.Player;

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

        showName();
        showName1();
        showImage();

        if (getIntent().hasExtra("Caracter")){
            Caracter caracter = getIntent().getParcelableExtra("Caracter");
        }


        }
        public void showName(){
            Intent intent = getIntent();
            if (intent != null) {
                String firstname = "";
                if (intent.hasExtra("name")) ;
                firstname = intent.getStringExtra("name");
                String fullText = "salut " + firstname;
                mTextViewName.setText(fullText);
            }


        }
    public void showName1() {
        Intent intent = getIntent();
        if (intent != null) {
            String firstname = "";
            if (intent.hasExtra("name")) ;
            firstname = intent.getStringExtra("name");
            String fullText = "salut " + firstname;
            mTextViewName2.setText(fullText);
        }

        }
    public void showImage(){
        Intent intent = getIntent();
        if(intent !=null){
            int avr = intent.getIntExtra("Avatar",0);
            mImageView.setImageResource(0);
        }


        }





    @Override
    public void onClick(View v) {
        if (v == mButtonAttBasique){


        }
        if (v == mButtonAttBasique2){

        }
        if (v == mButtonAttSpecial){

        }
        if (v == mButtonAttBasique2){

        }
    }
}