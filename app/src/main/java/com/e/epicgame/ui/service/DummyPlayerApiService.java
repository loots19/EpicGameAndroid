package com.e.epicgame.ui.service;

import com.e.epicgame.ui.model.Player;

import static com.e.epicgame.ui.model.Player.getForce;

public class DummyPlayerApiService implements PlayerApiservice {


    @Override
    public void attaquerBasiqueGuerrier(Player adversaire) {
        int dommages = Player.getForce();
        adversaire.setVie(adversaire.getVie() - dommages);
    }

    @Override
    public void attaquerSpecialeGuerrier(Player adversaire) {
        int dommages = Player.getForce() * 2;
        int dommages1 = getForce() / 2;
        adversaire.setVie(adversaire.getVie() - dommages);
        Player.setVie(Player.getVie() - dommages1);
    }

    @Override
    public void attaquerBasiqueMage(Player adversaire) {
        int dommages = Player.getIntelligence();
        adversaire.setVie(adversaire.getVie() - dommages);
    }

    @Override
    public void attaquerSpecialeMage(Player adversaire) {
        int gagne = 2 * Player.getIntelligence();
        Player.setVie(Player.getVie() + gagne);
    }

    @Override
    public void attaquerBasiqueRodeur(Player adversaire) {
        int dommages = Player.getAgilité();
        adversaire.setVie(adversaire.getVie() - dommages);
    }

    @Override
    public void attaquerSpecialeRodeur(Player adversaire) {
            int gagne = Player.getNiveau() / 2;
            Player.setAgilité(Player.getAgilité() + gagne);

        }
    }

