package com.engeto.examples.dumplings;

import java.time.*;

public class Pokoj {
    int cisloPokoje;    // číslo pokoje
    int pocetLuzek;     // počet lůžek
    boolean balkon;      // má pokoj balkon („true“), nemá pokoj balkon („false“)
    boolean vyhledNaMore;   // výhled na moře, jde vidět moře („true“), nejde vidět moře („false“)
    int cenaZaNoc;    // cena pokoje za noc

    //konstruktor
    public Pokoj(int cisloPokoje, int pocetLuzek, boolean balkon, boolean vyhledNaMore, int cenaZaNoc) {
        this.cisloPokoje = cisloPokoje;
        this.pocetLuzek = pocetLuzek;
        this.balkon = balkon;
        this.vyhledNaMore = vyhledNaMore;
        this.balkon = balkon;
        this.cenaZaNoc = cenaZaNoc;
    }

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public void setCisloPokoje(int newValue) {
        cisloPokoje = newValue;
    }

    public int getPocetLuzek() {
        return pocetLuzek;
    }

    public void setPocetLuzek(int newValue) {
        pocetLuzek = newValue;
    }

    public boolean isBalkon() {
        return balkon;
    }

    public void setBalkon(boolean newValue) {
        balkon = newValue;
    }

    public boolean isVyhledNaMore() {
        return vyhledNaMore;
    }

    public void setVyhledNaMore(boolean newValue) {
        vyhledNaMore = newValue;
    }

    public int getCenaZaNoc() {
        return cenaZaNoc;
    }

    public void setCenaZaNoc(int newValue) {
        cenaZaNoc = newValue;
    }

    public String getDescription() {
        return ("Pokoj číslo: " + cisloPokoje + " , počet míst " + pocetLuzek + " , balkon " + balkon + " , výhled na moře " + vyhledNaMore + "" +
                " , cena za jednu noc je " + cenaZaNoc + " Kč." );
    }
}
