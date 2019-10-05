package com.company;

public class Radiostation {

    double frequency;
    String name;
    String format;

    public Radiostation(double frequency) {
        this.frequency = frequency;
    }

    void playSong() {
        System.out.println("PlaySong");
    }

    void onAir() {
        System.out.println("onAir");
    }

    void startAd() {
        System.out.println("StartAd");
    }
}
