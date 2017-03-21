package com.simplon;


public enum TypeMoteur {
    DIESEL("DIESSEL"), ESSENCE("ESSENCE"), HYBRYDE("HYBRIDE"), ELECTRIQUE("ELECTRIQUE");
    private final String type;

    TypeMoteur(String type) {
        this.type = type;
    }

    public String getType(){return type;}
}
