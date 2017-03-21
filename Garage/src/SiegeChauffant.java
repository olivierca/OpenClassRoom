package com.simplon;


public class SiegeChauffant implements Option {
    private static final Double prix = Double.valueOf(562.9);

    @Override
    public Double getPrix() {
        return prix;
    }
    @Override
    public String toString(){return "Siège chauffant ("+ prix +"€)";}

}
