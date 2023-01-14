import java.util.Objects;

public class Mebel {
    public Mebel(String nazwa, double dlugosc, double szerokosc, Integer iloscNog){
        this.nazwa = nazwa;
        if (dlugosc >= 0) { this.dlugosc = dlugosc; }
        else { this.dlugosc = 0; }
        if (szerokosc >= 0) { this.szerokosc = szerokosc; }
        else { this.dlugosc = 0; }
        if (iloscNog >= 0) { this.iloscNog = iloscNog; }
        else { this.iloscNog = 0; }
        ile++;
    }

    public Mebel(double dlugosc, double szerokosc, Integer iloscNog){
        this("Jakis Mebel", dlugosc, szerokosc, iloscNog);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mebel mebel = (Mebel) o;
        return nazwa.equals(mebel.getNazwa()) && dlugosc == mebel.getDlugosc() && szerokosc == mebel.getSzerokosc() && iloscNog.equals(mebel.getIloscNog());
    }

    @Override
    public String toString() {
        if (nazwa.equals("Jakis Mebel")) {
            return "Mebel " +
                    "[dlugosc=" + dlugosc +
                    ", szerokosc=" + szerokosc +
                    ", iloscNog=" + iloscNog +
                    ']';
        }
        return "Mebel " +
                "[nazwa='" + nazwa +
                ", dlugosc=" + dlugosc +
                ", szerokosc=" + szerokosc +
                ", iloscNog=" + iloscNog +
                ']';
    }

    static private int ile;
    public static int getIle() {
        return ile;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public Integer getIloscNog() {
        return iloscNog;
    }

    private String nazwa;
    private double dlugosc;
    private double szerokosc;
    private Integer iloscNog;
}
