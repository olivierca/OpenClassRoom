package com.simplon;


public class MoteurElectrique extends Moteur {
    public MoteurElectrique(String cylindre, Double prix) {
        super(cylindre, prix);
        type = TypeMoteur.ELECTRIQUE;
    }
}
