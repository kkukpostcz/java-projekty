public class Ucitel {
    String nameUcitel;    // Jméno učitele.
    String prijmeniUcitele;    // Příjmení učitele.

    // konstruktor
    public Ucitel(String nameUcitel, String prijmeniUcitele) {
        this.nameUcitel = nameUcitel;
        this.prijmeniUcitele = prijmeniUcitele;
    }

    public String getNameUcitel() {
        return nameUcitel;
    }

    public void setNameUcitel(String nameUcitel) {
        this.nameUcitel = nameUcitel;
    }

    public String getPrijmeniUcitele() {
        return prijmeniUcitele;
    }

    public void setPrijmeniUcitele(String prijmeniUcitele) {
        this.prijmeniUcitele = prijmeniUcitele;
    }

    public String getDescriptionUcitel() {
        return ("Učitel je: " + nameUcitel + " " + prijmeniUcitele);
    }
}
