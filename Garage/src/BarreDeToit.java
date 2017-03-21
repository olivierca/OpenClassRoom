package com.simplon;


public class BarreDeToit implements Option {
    private static final Double prix = Double.valueOf(29.9);

    @Override
    public Double getPrix() {
        return prix;
    }
    @Override
    public String toString(){return "Barre de toit ("+ prix +"€)";}
}
