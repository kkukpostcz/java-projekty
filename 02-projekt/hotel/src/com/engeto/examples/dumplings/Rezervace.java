package com.engeto.examples.dumplings;

import java.time.*;
import java.util.*;

public class Rezervace {
    int cisloRezervace;         // číslo rezervace
    Host host;             // jméno hosta
    Pokoj pokoj;            // číslo pokoje
    LocalDate datumZacatkuRezervace;    // datum začátku rezervace
    LocalDate datumKonceRezervace;      // datum ukončení rezervace
    //String druhPobytu;                  // pracovní, nebo rekreační
    DruhPobytu druhPobytu = DruhPobytu.PRACOVNI; // pracovní, nebo rekreační
    ArrayList<Host> seznamHostu = new ArrayList<>();    // seznam hostů na pokoji





    //konstruktor
    public Rezervace(int cisloRezervace, Host host, Pokoj pokoj, LocalDate datumZacatkuRezervace,
                     LocalDate datumKonceRezervace, DruhPobytu druhPobytu) {
        this.cisloRezervace = cisloRezervace;
        this.host = host;
        this.pokoj = pokoj;
        this.datumZacatkuRezervace = datumZacatkuRezervace;
        this.datumKonceRezervace = datumKonceRezervace;
        this.druhPobytu = druhPobytu;
    }

    public int getCisloRezervace() {
        return cisloRezervace;
    }

    public void setCisloRezervace(int newValue) {
        cisloRezervace = newValue;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host newValue) {
        host = newValue;
    }

    public void setPokoj(Pokoj newValue) {
        pokoj = newValue;
    }

    public Pokoj getPokoj() {
        return pokoj;
    }

    public LocalDate getDatumZacatkuRezervace() {
        return datumZacatkuRezervace;
    }

    public void setDatumZacatkuRezervace(LocalDate newValue) {
        datumZacatkuRezervace = newValue;
    }

    public LocalDate getDatumKonceRezervace() {
        return datumKonceRezervace;
    }

    public void setDatumKonceRezervace(LocalDate newValue) {
        datumKonceRezervace = newValue;
    }

    public DruhPobytu getDruhPobytu() {
        return this.druhPobytu;
    }

    public void setDruhPobytu(DruhPobytu druhPobytu) {
        this.druhPobytu = druhPobytu;
    }

    public void addHost(Host newHost) {
        seznamHostu.add(newHost);
    }

    public void removeHostu(Host host) {
        seznamHostu.remove(host);
    }

//    public ArrayList<Host> getHosts() {
//        return new ArrayList<Host>(seznamHostu);
//    }

    public ArrayList<Host> getHosts() {
        for (Host host : seznamHostu) {
            System.out.println(host.getName() + " " + host.getPrijmeni() + " je na pokoji: " + pokoj.getCisloPokoje()
                    + " , číslo rezervace je: " + cisloRezervace);
            }
        return null;
    }

    public String getDescription() {
        return ("Číslo rezervace je: " + cisloRezervace + " , jméno hosta " + host.getName() + " " + host.getPrijmeni() + " , číslo pokoje "
                + pokoj.getCisloPokoje() + " , začátek rezervace " + datumZacatkuRezervace + " " + " , konec rezervace "
                + datumKonceRezervace + " , druh pobytu " + druhPobytu );
    }


}
