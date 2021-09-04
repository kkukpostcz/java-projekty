import java.time.LocalDate;

public class Student {
    String nameStudent;    // Jméno studenta.
    String prijmeniStudenta;    // Příjmení studenta.
    LocalDate datumNarozeniStudenta; // Datum narození studenta.
    int cisloStudenta;    // Číslo studenta.

    // konstruktor
    public Student(String nameStudent, String prijmeniStudenta, LocalDate datumNarozeniStudenta, int cisloStudenta) {
        this.nameStudent = nameStudent;
        this.prijmeniStudenta = prijmeniStudenta;
        this.datumNarozeniStudenta = datumNarozeniStudenta;
        this.cisloStudenta = cisloStudenta;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getPrijmeniStudenta() {
        return prijmeniStudenta;
    }

    public void setPrijmeniStudenta(String prijmeniStudenta) {
        this.prijmeniStudenta = prijmeniStudenta;
    }

    public LocalDate getDatumNarozeniStudenta() {
        return datumNarozeniStudenta;
    }

    public void setDatumNarozeniStudenta(LocalDate datumNarozeniStudenta) {
        this.datumNarozeniStudenta = datumNarozeniStudenta;
    }

    public int getCisloStudenta() {
        return cisloStudenta;
    }

    public void setCisloStudenta(int cisloStudenta) {
        this.cisloStudenta = cisloStudenta;
    }

    public String getDescriptionStudent() {
        return ("Student je: " + nameStudent + " " + prijmeniStudenta + ", datum narození " + datumNarozeniStudenta +
                ", číslo studenta " + cisloStudenta + ".");
    }
}
