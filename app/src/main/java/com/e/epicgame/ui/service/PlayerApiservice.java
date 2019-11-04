package com.e.epicgame.ui.service;

import com.e.epicgame.ui.model.Player;

public interface PlayerApiservice {

    void attaquerBasiqueGuerrier(Player adversaire);

    void attaquerSpecialeGuerrier(Player adversaire);

    void attaquerBasiqueMage(Player adversaire);

    void attaquerSpecialeMage(Player adversaire);

    void attaquerBasiqueRodeur(Player adversaire);

    void attaquerSpecialeRodeur(Player adversaire);
}