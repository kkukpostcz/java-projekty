package com.engeto.ifloop;

import java.util.*;

public class Main {

    //region Demo
    /**
     * Ukázka použítí metody {@link Support#safeReadInt()}
     *
     * Tato metoda použije metodu {@link Support#safeReadInt() k načtení
     * jednoho čísla od uživatele a vypsání tohoto čísla na výstup.
     *
     * Podobně můžeš používat metodu {@link Support#safeReadInt()}
     * i v dalších metodách.
     */
    public static void readOneIntFromInputAndPrintIt() {
        int input = Support.safeReadInt();
        System.out.println("You entered: "+input);
    }
    //endregion

    //region Úlohy na cykly
    /**      Úkol 1
     * Čte čísla, která zadává uživatel a vypisuje je na výstup.
     * Metoda pokračuje ve čtení opakovaně tak dlouho, dokud uživatel zadává kladná čísla či nulu.
     *
     * Jakmile uživatel zadá záporné číslo, metoda skončí.
     */
    public static void readIntsFromInputAndPrintItUntilNegative() {
        System.out.println("Úkol číslo 1");
        System.out.println("Zadávej čísla (zadávání ukončíš záporným číslem): ");
        int input = Support.safeReadInt();
        while (input > -1) {
            System.out.println("Zadal jsi číslo:" + input);
            input = Support.safeReadInt();

        }


    }

    /**      Úkol 2
     * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
     * Jako návratovou hodnotu vrátí součet zadaných čísel (záporné číslo by nemělo být zahrnuto).
     *
     * @return Součet všech zadaných čísel (záporné číslo ukončující vstup není zahrnuto).
     */
    public static int sumAllInputUntilNegative() {
        System.out.println("Úkol číslo 2");
        System.out.println("Zadávej čísla, dostaneš součet čísel (zadávání ukončíš záporným číslem): ");
        int soucet = 0;

        int input = Support.safeReadInt();
        while (input > -1) {
            //System.out.println("Zadal jsi číslo:" + input);
            soucet = soucet + input;
            input = Support.safeReadInt();
        }
        return soucet;
        
    }

    /**      Úkol 3
     * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
     * Všechna načtená čísla uloží do listu, který vrátí jako návratovou hodnotu.
     *
     * @return List načtených hodnot (záporná hodnota není zahrnuta v listu)
     */
    public static List storeAllInputInArrayListUntilNegative() {
        System.out.println("Úkol číslo 3");
        System.out.println("Zadávej čísla, čísla ukládám do Listu (zadávání ukončíš záporným číslem): ");
        List<Integer> listCisel = new ArrayList<Integer>();

        int input = Support.safeReadInt();
        while (input > -1) {
            System.out.println("Zadal jsi číslo:" + input);
            listCisel.add(input);
            input = Support.safeReadInt();
        }
        //System.out.println("ArrayList : " + listCisel.toString());

        return listCisel;
    }

    /**      Úkol 4
     * Dostane jako parametr list čísel. Vypíše čísla na obrazovku.
     * @param list List čísel, která se mají vypsat.
     */

    
    public static void printAllIntegersFromList(List<Integer> list) {
        System.out.println(list);

    }

    /**      Úkol 5
     * Sečte hodnoty z listu a vrátí výsledek jako návratovou hodnotu.
     * @param list List čísel, která chceme sečíst.
     * @return Součet všech čísel v listu.
     */
    public static Integer sumAllIntegersFromList(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i <= (list.size()-1); i++) {
            //System.out.println(list.get(i));
            sum = sum + list.get(i);
        }

//        int sum = 0;
//        for (int i : list) {
//            sum = sum + i;
//        }

        return sum;
    }
    //endregion

    //region Podmínky
    /**      Úkol 6
     * Vypíše čísla ze seznamu, která jsou menší než zadaný limit.
     * @param list Seznam čísel, která máme zkontrolovat.
     * @param limit Limit - vypsána budou pouze čísla z listu, která jsou menší než limit
     */
    public static void printIntegersUnderLimit(List<Integer> list, int limit) {
        
        for (int i = 0; i <= (list.size()-1); i++) {
            //System.out.println(list.get(i));
            if (limit > list.get(i)) {
                System.out.println(list.get(i));
            }

        }        

    }

    /**            Úkol 7
     * Vypíše čísla ze zadaného listu.
     * Při výpisu ale nahradí:
     * - číslo 1 slovem "one",
     * - číslo 2 slovem "two",
     * - číslo 3 slovem "three"
     * Ostatní čísla vypíše jako číselnou hodnotu.
     * Například pokud dostane jako parametr seznam [5, 3, 1, 48, 2],
     * vypíše: 5, three, one, 48, two.
     * @param list Seznam čísel, která se mají vypsat.
     */
    public static void printIntegersWithReplace(List<Integer> list) {
        for (int i = 0; i <= (list.size()-1); i++) {
            //System.out.println(list.get(i));
            switch (list.get(i))
            {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                default:
                    System.out.println(list.get(i));
            }

            }

    }

    //endregion

    public static void main(String[] args) {
        // Příklad:
//        System.out.println("--- Example - read and print one integer ---");
//        readOneIntFromInputAndPrintIt();
        // Zadej číslo a potom Enter
        // ---
//        System.out.println("--- Task 1 - read and print integers until negative ---");
//        readIntsFromInputAndPrintItUntilNegative();
        // ---
//        System.out.println("--- Task 2 - sum all integers until negative ---");
//        System.out.println("Total sum: " + sumAllInputUntilNegative());;
        // ---
//        System.out.println("--- Task 3 - read integers to list until negative ---");
//        List<Integer> list = storeAllInputInArrayListUntilNegative();
//        System.out.println(list);
        // ---

//        List<Integer> listUkol4 = Arrays.asList(1, 2, 3);
//        System.out.println("--- Task 4 - print all integers from list ---");
//        printAllIntegersFromList(listUkol4);
        // ---
//        List<Integer> listUkol5 = Arrays.asList(1, 2, 3);
//        System.out.println("--- Task 5 - sum all integers in list ---");
//        System.out.println("Total sum: " + sumAllIntegersFromList(listUkol5));
//        // ---
//        List<Integer> listUkol6 = Arrays.asList(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println("--- Task 6 - print integers under 5 from list ---");
//        printIntegersUnderLimit(listUkol6, 5);
        // ---
        List<Integer> listUkol7 = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        System.out.println("--- Task 7 - print integers - replace: 1 => \"one\", 2 => \"two\", 3 => \"three\" ---");
        printIntegersWithReplace(listUkol7);
    }
}