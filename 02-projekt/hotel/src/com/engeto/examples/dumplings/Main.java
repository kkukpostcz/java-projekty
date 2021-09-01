package com.engeto.examples.dumplings;

import java.time.*;

public class Main {

    public static void main(String[] args) {

        Host host01 = new Host("Karel", "Novák", LocalDate.of(1988,10,24));
        System.out.println(host01.getName());
        System.out.println(host01.getPrijmeni());
        System.out.println(host01.getDatumNarozeni());
        System.out.println(host01.getDescription());

//        System.out.println(" ");
//        System.out.println("--------------------------");
//        System.out.println(" ");
//
//        Pokoj pokoj01 = new Pokoj(1, 4, true, true, 1000);
//        System.out.println(pokoj01.cisloPokoje);
//        System.out.println(pokoj01.pocetLuzek);
//        System.out.println(pokoj01.balkon);
//        System.out.println(pokoj01.vyhledNaMore);
//        System.out.println(pokoj01.cenaZaNoc);
//        System.out.println(pokoj01.getDescription());
//
//        System.out.println(" ");
//        System.out.println("--------------------------");
//        System.out.println(" ");
//
//        Rezervace rezervace01 = new Rezervace(1, host01, pokoj01, LocalDate.of(2021,9,24), LocalDate.of(2021,9,30), "pracovní");
//        System.out.println(rezervace01.getDescription());
//
//        System.out.println(" ");
//        System.out.println("--------------------------");
//        System.out.println(" ");
//
//
        Host host02 = new Host("Adéla", "Malíková", LocalDate.of(1993,3,13));
        System.out.println(host02.getDescription());

        Host host03 = new Host("Jan", "Dvořáček", LocalDate.of(1995,5,5));
        System.out.println(host03.getDescription());

        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println(" ");

        Pokoj pokoj02 = new Pokoj(2, 1, true, true, 1000);   // pokoj jedna už mám a proto pokračuji v číslování
        System.out.println(pokoj02.getDescription());

        Pokoj pokoj03 = new Pokoj(3, 1, true, true, 1000);
        System.out.println(pokoj03.getDescription());

        Pokoj pokoj04 = new Pokoj(4, 3, false, true, 2400);
        System.out.println(pokoj04.getDescription());

        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println(" ");

        Rezervace rezervace02 = new Rezervace(2, host02, pokoj02, LocalDate.of(2021,7,19), LocalDate.of(2021,7,26), DruhPobytu.PRACOVNI);
        System.out.println(rezervace02.getDescription());

        Rezervace rezervace03 = new Rezervace(3, host02, pokoj04, LocalDate.of(2021,9,1), LocalDate.of(2021,9,14), DruhPobytu.REKREACNI);
        System.out.println(rezervace03.getDescription());

        //Rezervace rezervace04 = new Rezervace(4, host03, pokoj04, LocalDate.of(2021,9,1), LocalDate.of(2021,9,14), DruhPobytu.PRACOVNI);
        //System.out.println(rezervace04.getDescription());


        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println(" ");

        rezervace03.addHost(host03);
        rezervace03.addHost(host01);
        // rezervace03.removeHostu(host01);
        rezervace03.getHosts();
        
    }
}
