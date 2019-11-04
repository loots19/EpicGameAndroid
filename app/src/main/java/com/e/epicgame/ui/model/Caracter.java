package com.e.epicgame.ui.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Caracter implements Parcelable {

    private String mNameCaracter;
    private int mImageAvatar;

    public Caracter(String nameCaracter, int imageAvatar) {
        mNameCaracter = nameCaracter;
        mImageAvatar = imageAvatar;
    }

    protected Caracter(Parcel in) {
        mNameCaracter = in.readString();
        mImageAvatar = in.readInt();
    }

    public static final Creator<Caracter> CREATOR = new Creator<Caracter>() {
        @Override
        public Caracter createFromParcel(Parcel in) {
            return new Caracter(in);
        }

        @Override
        public Caracter[] newArray(int size) {
            return new Caracter[size];
        }
    };

    public String getNameCaracter() {
        return mNameCaracter;
    }

    public void setNameCaracter(String nameCaracter) {
        mNameCaracter = nameCaracter;
    }

    public int getImageAvatar() {
        return mImageAvatar;
    }

    public void setImageAvatar(int imageAvatar) {
        mImageAvatar = imageAvatar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mNameCaracter);
        dest.writeInt(mImageAvatar);
    }
}