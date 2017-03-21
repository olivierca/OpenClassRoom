package com.simplon;

import java.util.ArrayList;
import java.util.List;

public class Vehicule implements Option {
    protected Double prix = 0d;
    protected String nom;
    private List<Option> options = new ArrayList<Option>();
    protected Marque nomMarque;
    private Moteur moteur;

    public Double getPrix() {
        return prix;
    }

    public String toString() {
       return "+ Voiture "+getMarque()+moteur+getOptions()+" d'une valeur totale de "+getPrix()+"€\r\n";
    }

    public void addOption(Option opt) {
        options.add(opt);
        prix += opt.getPrix();
    }

    private Marque getMarque() {
        return nomMarque;
    }

    private List<Option> getOptions() {
        return options;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
        prix = moteur.getPrix();
    }
}
