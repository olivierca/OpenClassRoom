package com.simplon;


public class GPS implements Option {
    private static final Double prix = Double.valueOf(113.5);

    @Override
    public Double getPrix() {
        return prix;
    }
    @Override
    public String toString(){return "GPS ("+ prix +"€)";}
}
