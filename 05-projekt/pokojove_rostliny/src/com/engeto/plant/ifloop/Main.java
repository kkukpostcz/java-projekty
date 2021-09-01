package com.engeto.plant.ifloop;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
//        PlantSummary soubor = null;
//        try {
//            soubor = PlantSummary.importFromTextFile("kvetiny.txt");
//        } catch (PlantException e) {
//            System.err.println("Nepodařilo se načíst data ze souboru: kvetiny.txt " + e.getMessage());
//        }
//
//
//        System.out.println(soubor.getPlant());
//
//        System.out.println("--------------------------");
//
//        try {
//            soubor.exportToFile("kvetiny.txt");
//        } catch (PlantException e) {
//            e.printStackTrace();
//        }

        //        System.out.println("--------------------------");


//        try {
//            Plant kvitek01 = new Plant("astra", "kvete", LocalDate.of(2021,7,24), LocalDate.of(2021,6,24), 7);
//            System.out.println(kvitek01.getName());
//            System.out.println(kvitek01.getNotes());
//            System.out.println(kvitek01.getPlanted());
//            System.out.println(kvitek01.getWatering());
//            System.out.println(kvitek01.getFrequencyOfWatering());
//
//        } catch (PlantException ex) {
//            System.err.println("" + ex.getMessage());
//            // ex.printStackTrace();
//            // throw new RuntimeException(e);
//        }
//
//
//
//        System.out.println("--------------------------");
//
//        Plant kvitek02 = new Plant("mečík", LocalDate.of(2021,9,24), 7);
//        System.out.println(kvitek02.getName());
//        System.out.println(kvitek02.getNotes());
//        System.out.println(kvitek02.getPlanted());
//        System.out.println(kvitek02.getWatering());
//        System.out.println(kvitek02.getFrequencyOfWatering());
//
//        System.out.println("--------------------------");
//
//        Plant kvitek03 = new Plant("tulipán");
//        System.out.println(kvitek02.getName());
//        System.out.println(kvitek02.getNotes());
//        System.out.println(kvitek02.getPlanted());
//        System.out.println(kvitek02.getWatering());
//        System.out.println(kvitek02.getFrequencyOfWatering());
//
//        System.out.println("--------------------------");
//
//        System.out.println(kvitek01.getWateringInfo());
//        System.out.println(kvitek01.getWateringInfo02());
//
//        System.out.println("--------------------------");
//
//        // ošetření nastavení záporné nebo nulové zálivky
//        System.out.println(kvitek03.getFrequencyOfWatering());
//        try {
//            kvitek03.setFrequencyOfWatering(10);
//            // System.out.println(kvitek03.getFrequencyOfWatering());
//            // kvitek03.setFrequencyOfWatering(-1);
//            // System.out.println(kvitek03.getFrequencyOfWatering());
//            kvitek03.setFrequencyOfWatering(0);
//            // System.out.println(kvitek03.getFrequencyOfWatering());
//        } catch (PlantException ex) {
//            System.err.println("Hodnota musí být větší než nula: " + ex.getMessage());
//            // ex.printStackTrace();
//            // throw new RuntimeException(e);
//        }
//
//        System.out.println("--------------------------");
//
//        // něco je špatně jde zadat záporný interval zalití v konstruktoru
//        System.out.println(kvitek03.getFrequencyOfWatering());
//        Plant kvitek04 = new Plant("astra", "kvete", LocalDate.of(2021,7,24), LocalDate.of(2021,8,20), -7);
//        System.out.println(kvitek04.getName());
//        System.out.println(kvitek04.getNotes());
//        System.out.println(kvitek04.getPlanted());
//        System.out.println(kvitek04.getWatering());
//        System.out.println(kvitek04.getFrequencyOfWatering());
//
//
        System.out.println("--------------------------");

        PlantSummary seznam = new PlantSummary();
        try {
            seznam.addPlant(new Plant("astra", "sadit hluboko", LocalDate.of(2021,8,24), LocalDate.of(2021,10,15),3));
            seznam.addPlant(new Plant("tulipán", "dovoz", LocalDate.of(2021,5,23), LocalDate.of(2021,8,20),7));
        }  catch (PlantException ex) {
            System.err.println("" + ex.getMessage());
            // ex.printStackTrace();
            // throw new RuntimeException(e);
        }

//
        System.out.println(seznam.getPlant());

        //   vyhledá květinu podle indexu v seznamu a vytiskne
       System.out.println(seznam.getPlantIndex(1));



    }
}
