package com.e.epicgame.ui.model;

public class Player {

    private static int  mNiveau;
    private static int mForce;
    private static int mAgilité;
    private static int mIntelligence;
    private static int mVie;
    private int mNumPlayer;

    public Player( int niveau, int force, int agilité, int intelligence, int vie, int numPlayer) {

        mNiveau = niveau;
        mForce = force;
        mAgilité = agilité;
        mIntelligence = intelligence;
        mVie = vie;
        mNumPlayer = numPlayer;
    }
    public boolean estMort(){
        return (this.mVie <= 0);
    }



    public static int getNiveau() {
        return mNiveau;
    }

    public void setNiveau(int niveau) {
        mNiveau = niveau;
    }

    public static int getForce() {
        return mForce;
    }

    public void setForce(int force) {
        mForce = force;
    }

    public static int getAgilité() {
        return mAgilité;
    }

    public static void setAgilité(int agilité) {
        mAgilité = agilité;
    }

    public static int getIntelligence() {
        return mIntelligence;
    }

    public void setIntelligence(int intelligence) {
        mIntelligence = intelligence;
    }

    public static int getVie() {
        return mVie;
    }

    public static void setVie(int vie) {
        mVie = (mVie<= 0 ? 0 : mVie);
    }

    public int getNumPlayer() {
        return mNumPlayer;
    }

    public void setNumPlayer(int numPlayer) {
        mNumPlayer = numPlayer;
    }



}