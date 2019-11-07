package com.e.epicgame.ui.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Player implements Parcelable {
    private int mNiveau;
    private int mForce;
    private int mAgilite;
    private int mIntelligence;
    private int mVie;

    public Player(int niveau, int force, int agilite, int intelligence, int vie) {
        mNiveau = niveau;
        mForce = force;
        mAgilite = agilite;
        mIntelligence = intelligence;
        mVie = vie;
    }


    protected Player(Parcel in) {
        mNiveau = in.readInt();
        mForce = in.readInt();
        mAgilite = in.readInt();
        mIntelligence = in.readInt();
        mVie = in.readInt();
    }

    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };

    public int getNiveau() {
        return mNiveau;
    }

    public void setNiveau(int niveau) {
        mNiveau = niveau;
    }

    public int getForce() {
        return mForce;
    }

    public void setForce(int force) {
        mForce = force;
    }

    public int getAgilite() {
        return mAgilite;
    }

    public void setAgilite(int agilite) {
        mAgilite = agilite;
    }

    public int getIntelligence() {
        return mIntelligence;
    }

    public void setIntelligence(int intelligence) {
        mIntelligence = intelligence;
    }

    public int getVie() {
        return mVie;
    }

    public void setVie(int vie) {
        mVie = vie;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mNiveau);
        dest.writeInt(mForce);
        dest.writeInt(mAgilite);
        dest.writeInt(mIntelligence);
        dest.writeInt(mVie);
    }
}
