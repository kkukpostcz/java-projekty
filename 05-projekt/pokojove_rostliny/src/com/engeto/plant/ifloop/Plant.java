package com.engeto.plant.ifloop;

import java.time.*;

import static java.time.LocalDate.*;

public class Plant {
    String name;                // název
    String notes;               // poznámky
    LocalDate planted;          // datum, kdy byly zasazena
    LocalDate watering;         // datum poslední zálivky
    int frequencyOfWatering;    // běžnou frekvenci zálivky ve dnech (_frequency of watering_)

    // konstruktor
    public Plant(String nameStr, String notesStr, String plantedStr, String wateringStr, String frequencyOfWateringStr) throws PlantException {
        this.name = nameStr;
        this.notes = notesStr;
        this.planted = LocalDate.parse(plantedStr);
        this.watering = LocalDate.parse(wateringStr);
        this.frequencyOfWatering = Integer.parseInt(frequencyOfWateringStr);
    }


    public Plant(String name, String notes, LocalDate planted, LocalDate watering, int frequencyOfWatering) throws PlantException {
        this.name = name;
        this.notes = notes;
        this.planted = planted;
        if (watering.isBefore(planted)){
            //System.out.println("špatný datum");
            throw new PlantException("Datum zalití květiny je před zasazením květiny: " + watering);
        }
        this.watering = watering;
        this.frequencyOfWatering = frequencyOfWatering;
    }

    public Plant(String name, LocalDate planted, int frequencyOfWatering) {
        this.name = name;
        this.notes = "";
        this.planted = planted;
        this.watering = now();
        this.frequencyOfWatering = frequencyOfWatering;
    }

    public Plant(String name) {
        this.name = name;
        this.notes = "";
        this.planted = now();
        this.watering = now();
        this.frequencyOfWatering = 7;
    }

    public String getName() {
        return name;
    }

    public void setName(String newValue) {
        name = newValue;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String newValue) {
        notes = newValue;
    }

    public LocalDate getPlanted() {
        return planted;
    }

    public void setPlanted(LocalDate newValue) {
        planted = newValue;
    }

    public LocalDate getWatering() {
        return watering;
    }

    public void setWatering(LocalDate newValue) {
        watering = newValue;
    }

    public int getFrequencyOfWatering() {
        return frequencyOfWatering;
    }

    public void setFrequencyOfWatering(int newValue) throws PlantException {
        if (newValue <= 0){
            //System.out.println("Hodnota musí být větší" + newValue);
            throw new PlantException("Hodnota musí být větší než nula: " + newValue);
        }
        frequencyOfWatering = newValue;
    }

    public  String getWateringInfo(){
        return ("Květina se jmenuje " + name + ", datum poslední zálivky " + watering
                + " , doporučuji zalít "+ watering.plusDays(frequencyOfWatering));
    }


    public  String getWateringInfo02(){
        return ("Květina se jmenuje " + name + ", poznámky " + notes + ", zasazeno " + planted +
                ", datum poslední zálivky " + watering + " , zalívat jednou za "+ frequencyOfWatering + " dnů.");
    }

    @Override
    public String toString() {
        return "Plant " +
                "name=\"" + name + "\"" + ", " +
                "notes=\"" + notes + "\"" + ", " +
                "planted=" + planted + ", " +
                "watering=" + watering + ", " +
                "frequencyOfWatering=" + frequencyOfWatering;
    }
}
