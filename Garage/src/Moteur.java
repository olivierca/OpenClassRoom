package com.simplon;


public class Moteur {
    protected TypeMoteur type = TypeMoteur.DIESEL;
    protected String cylindre;
    protected Double prix = 0d;

    public Moteur(String cylindre, Double prix) {
        this.prix = prix;
        this.cylindre = cylindre;
    }

    public String toString() {
        return " Moteur "+type.getType()+" "+cylindre+" ("+prix+"€) ";
    }

    public Double getPrix() {
        return prix;
    }
}
