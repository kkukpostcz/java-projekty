import java.time.LocalDate;
import java.util.ArrayList;




public class Trida {
    String nameTridy;    // Jméno třídy
    String rocnik;    // Ročník
    Ucitel prijmeniUcitel; // Přijmení třídního učitele
    ArrayList<Student> seznamStudentu = new ArrayList<>();  // Seznam studentů ve třídě

    // konstruktor
//    public Trida(String nameTridy, String rocnik, Ucitel prijmeniUcitel, ArrayList<Student> seznamStudentu) {
//        this.nameTridy = nameTridy;
//        this.rocnik = rocnik;
//        this.prijmeniUcitel = prijmeniUcitel;
//        this.seznamStudentu = seznamStudentu;
//    }

    public Trida(String nameTridy, String rocnik, Ucitel prijmeniUcitel) {
        this.nameTridy = nameTridy;
        this.rocnik = rocnik;
        this.prijmeniUcitel = prijmeniUcitel;

    }

    public String getNameTridy() {
        return nameTridy;
    }

    public void setNameTridy(String nameTridy) {
        this.nameTridy = nameTridy;
    }

    public String getRocnik() {
        return rocnik;
    }

    public void setRocnik(String rocnik) {
        this.rocnik = rocnik;
    }

    public Ucitel getPrijmeniUcitel() {
        return prijmeniUcitel;
    }

    public void setPrijmeniUcitel(Ucitel prijmeniUcitel) {
        this.prijmeniUcitel = prijmeniUcitel;
    }

    public void addSeznamStudentu(Student newStudent) {
        seznamStudentu.add(newStudent);
    }

    public void removeSeznamStudentu(Student student) {
        seznamStudentu.remove(student);
    }

    public ArrayList<Student> getSeznamStudentu() {
        for (Student student : seznamStudentu) {
            System.out.println(student.getNameStudent() + " " + student.getPrijmeniStudenta() + " chodí do třídy " + nameTridy);
        }
        return null;
    }

    public ArrayList<Student> getSeznamStudentu02() {
        for (Student student : seznamStudentu) {
            System.out.println(student.getCisloStudenta() + ", " + student.getNameStudent() + " " + student.getPrijmeniStudenta());
        }
        return null;
    }

    public String getDescriptionTrida01() {
        return ("####################################" + "\n" + "Třída: " + nameTridy + " (ročník: " + getRocnik() + ") "
                + "\n" + "Třídní učitel: " + prijmeniUcitel.getPrijmeniUcitele() + ", " + prijmeniUcitel.getNameUcitel() +
                "\nPočet studentů: "+ seznamStudentu.size() + "\n" + "\n" + "####################################"+ "\n" +
                getSeznamStudentu02() );
    }
    public String getDescriptionTrida02(Trida trida) {
        return ("####################################" + "\n" + nameTridy + ", " + prijmeniUcitel.getNameUcitel() + " "
                + prijmeniUcitel.getPrijmeniUcitele()) + "\n" + trida.getSeznamStudentu02();
    }
}
