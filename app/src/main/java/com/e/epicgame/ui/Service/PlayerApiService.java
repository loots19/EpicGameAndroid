package com.e.epicgame.ui.Service;

import com.e.epicgame.ui.model.Player;

public interface PlayerApiService   {

    void attaqueBasiqueGuerrier(Player adversaire);
    void attaqueSpecialGuerrier(Player adversaire);
    void attaqueBasiqueMage(Player adversaire);
    void attaqueSpecialMage(Player adversaire);
    void attaqueBasiqueRodeur(Player adversaire);
    void attaqueSpecialRodeur(Player adversaire);

}
