package com.e.epicgame.ui.service;

import com.e.epicgame.R;
import com.e.epicgame.ui.model.Caracter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DummyCaracterGenerator {

    public static List<Caracter> DUMMY_CARACTER = Arrays.asList(
            new Caracter("Warrior", R.drawable.ic_3325766_2196f3),
            new Caracter("Magicus",R.drawable.ic_1456914),
            new Caracter("Ranger",R.drawable.ic_1676583)

    );
    static List<Caracter> generateCaracter(){
        return new ArrayList<>(DUMMY_CARACTER);
    }
}
