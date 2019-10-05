package com.company;

public class Main {

    public static void main(String[] args) {
        Radiostation dfm = new Radiostation(101.3d);
        dfm.onAir();
        Radiostation europaPlus = new Radiostation(105.2d);
        europaPlus.playSong();
    }
}
