package com.simplon;


public enum Marque {
    RENO("Lagouna"), PIGEOT("A300B"), TROEN("D4");

    private final String marque;

    Marque(String marque) {
        this.marque = marque;
    }

    public String getMarque(){return marque;}
}
