package pl.uwm.wmii.kmmi.przybyszewski;

public class Student extends Osoba{

    public Student(String nazwisko, int rokUrodzenia, String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + getNazwisko() + '\'' +
                ", rokUrodzenia=" + getRokUrodzenia() + '\'' +
                ", kierunek=" + kierunek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            return super.equals(o) && kierunek.equals(((Student) o).kierunek);
        }
        return false;
    }


    private String kierunek;
}
