package com.engeto.plant.ifloop;


import java.io.*;
import java.util.*;
import java.util.Scanner;

public class PlantSummary {

    

    public static PlantSummary importFromTextFile(String fileName) throws  PlantException{
        PlantSummary soubor = new PlantSummary();
        try (Scanner scanner = new Scanner(new FileInputStream(fileName))){
            while (scanner.hasNextLine()) {
                String inputLine = scanner.nextLine();
                String[] items = inputLine.split(";");      // oddělovač ;
                if (items.length != 5) throw new PlantException("Nesprávný počet sloupců na řádku: "+inputLine+" ("+items.length+" sloupců)");
                Plant plant = new Plant(items[0], items[1], items[4], items[3], items[2]);
                soubor.addPlant(plant);

                //System.out.println(inputLine);

            }
        } catch (FileNotFoundException ex) {
            throw new PlantException("Soubor "+fileName+" nenalezen: "+ex.getLocalizedMessage());
        }
        return soubor;
    }



    public void exportToFile(String filename) throws PlantException{
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(filename))) {
            for (Plant plant: list) {
            writer.println(
                        plant.getName() + ";" + plant.getNotes() +  ";" + plant.getFrequencyOfWatering() + ";" +
                                plant.getWatering() + ";" + plant.getPlanted());
            }
        } catch (FileNotFoundException e) {
            throw new PlantException("Soubor "+filename+" nenalezen: "+e.getLocalizedMessage());
        }
    }

    private List<Plant> list = new ArrayList<>();

    // přidání květiny do seznamu
    public void addPlant(Plant plant) {
        list.add(plant);
    }

    // smazání květiny ze seznamu
    public void removePlant(Plant plant) {
        list.remove(plant);
    }

    // vyhledá květinu podle indexu v seznamu
    public Plant getPlantIndex( int i) {
        return list.get(i);
    }

    // vypíšu všechny květiny v seznamu
    public ArrayList<Plant> getPlant() {
        for (Plant plant : list) {
            System.out.println(plant.name);
            
        }
        return null;
    }


}
