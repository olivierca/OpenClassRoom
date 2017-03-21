package com.simplon;


public class VitreElectrique implements Option {
    private static final Double prix = Double.valueOf(212.35);

    @Override
    public Double getPrix() {
        return prix;
    }
    @Override
    public String toString(){return "Vitre électrique ("+ prix +"€)";}
}
