package com.e.epicgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Game extends AppCompatActivity implements View.OnClickListener {

    private ImageButton mButtonMage;
    private ImageButton mButtonGuerrier;
    private ImageButton mButtonRodeur;
    private EditText mEditTextNameInput;
    private Button mButtonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mButtonGuerrier = findViewById(R.id.activity_game_buttonGuerrier);
        mButtonMage = findViewById(R.id.activity_game_buttonMage);
        mButtonRodeur = findViewById(R.id.activity_game_buttonRodeur);
        mButtonNext = findViewById(R.id.activity_game_buttonNext);


        mButtonGuerrier.setOnClickListener(this);
        mButtonMage.setOnClickListener(this);
        mButtonRodeur.setOnClickListener(this);
        mButtonNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mButtonGuerrier) {
            Log.e( "onClick: ","click" );
            Toast.makeText(this,"Vous avez choisi le Guerrier",Toast.LENGTH_SHORT).show();


        } else if (v == mButtonMage) {
            Toast.makeText(this,"Vous avez choisi le Mage",Toast.LENGTH_LONG).show();

        } else if (v == mButtonRodeur) {
            Toast.makeText(this,"Vous avez choisi le Rodeur",Toast.LENGTH_LONG).show();

        } else if (v == mButtonNext) {
            Intent caracteristiqueActivity = new Intent(Game.this,Caracteristiques.class);
            startActivity(caracteristiqueActivity);

        }


    }
}









