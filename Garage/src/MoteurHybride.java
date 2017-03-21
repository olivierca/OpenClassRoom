package com.simplon;


public class MoteurHybride extends Moteur {
    public MoteurHybride(String cylindre, Double prix) {
        super(cylindre, prix);
        type = TypeMoteur.HYBRYDE;
    }
}
