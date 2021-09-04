import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        System.out.println("----------------------");

        Ucitel ucitel01 = new Ucitel( "Jirka", "Novák" );
//        System.out.println(ucitel01.nameUcitel);
//        System.out.println(ucitel01.prijmeniUcitele);
        System.out.println(ucitel01.getDescriptionUcitel());

        Ucitel ucitel02 = new Ucitel( "Petr", "Šiška" );
//        System.out.println(ucitel02.nameUcitel);
//        System.out.println(ucitel02.prijmeniUcitele);
        System.out.println(ucitel02.getDescriptionUcitel());

        System.out.println("----------------------");

        Student student01 = new Student( "Jana", "Rychlá",
                LocalDate.of(1988,10,24), 1 );
//        System.out.println(student01.nameStudent);
//        System.out.println(student01.prijmeniStudenta);
//        System.out.println(student01.datumNarozeniStudenta);
//        System.out.println(student01.cisloStudenta);
        System.out.println(student01.getDescriptionStudent());

        Student student02 = new Student( "Jitka", "Holá",
                LocalDate.of(1999,10,24), 2 );
//        System.out.println(student02.nameStudent);
//        System.out.println(student02.prijmeniStudenta);
//        System.out.println(student02.datumNarozeniStudenta);
//        System.out.println(student02.cisloStudenta);
        System.out.println(student02.getDescriptionStudent());

        Student student03 = new Student( "Petra", "Holasová",
                LocalDate.of(2000,1,22), 3 );
        Student student04 = new Student( "Ondra", "Ondra",
                LocalDate.of(2005,11,21), 4 );
        Student student05 = new Student( "Jan", "Veselý",
                LocalDate.of(2010,9,2), 5 );

        System.out.println("----------------------");

        Trida tridaA1 = new Trida("A1", "1", ucitel01);
//        Trida tridaA2 = new Trida("A2", "2", ucitel02, student01 );
//        Trida tridaA3 = new Trida("A3", "3", ucitel02, (student01, student02) );

        System.out.println("----------------------");

        Trida tridaB1 = new Trida("B1", "1", ucitel01);

        tridaB1.addSeznamStudentu(student01);
        tridaB1.addSeznamStudentu(student02);

        Trida tridaB2 = new Trida("B2", "2", ucitel02);

        tridaB2.addSeznamStudentu(student03);
        tridaB2.addSeznamStudentu(student04);

        //System.out.println(tridaB1.seznamStudentu);

        // rezervace03.removeHostu(host01);
       // tridaB1.getSeznamStudentu();

        System.out.println("----------------------");
        System.out.println("----------------------");

        System.out.println(tridaB2.getDescriptionTrida01());

        System.out.println("----------------------");
        System.out.println("----------------------");

        System.out.println(tridaB1.getDescriptionTrida02(tridaB1));





    }

}
