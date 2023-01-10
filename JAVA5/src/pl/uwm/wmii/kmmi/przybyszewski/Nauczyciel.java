package pl.uwm.wmii.kmmi.przybyszewski;

public class Nauczyciel extends Osoba{

    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + getNazwisko() + '\'' +
                ", rokUrodzenia=" + getRokUrodzenia() + '\'' +
                ", kierunek=" + pensja +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Nauczyciel) {
            return super.equals(o) && pensja == ((Nauczyciel) o).pensja;
        }
        return false;
    }
    
    private int pensja;
}
