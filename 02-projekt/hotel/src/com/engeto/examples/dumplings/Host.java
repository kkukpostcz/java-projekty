package com.engeto.examples.dumplings;

import java.time.*;

public class Host {
    String name;    // Jméno hosta.
    String prijmeni;    // Příjmení hosta.
    LocalDate datumNarozeni; // Datum narození hosta.

    //konstruktor
    public Host(String name, String prijmeni, LocalDate datumNarozeni) {
        this.name = name;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public String getDescription() {
        return ("Jméno hosta je: " + name + " " + prijmeni + " a narodil se: " + datumNarozeni);
    }

}
