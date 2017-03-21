package com.simplon;


public class Climatisation implements Option {
    private static final Double prix = Double.valueOf(347.3);

    @Override
    public Double getPrix() {
        return prix;
    }
    @Override
    public String toString(){return "Climatisation ("+ prix +"€)";}
}
