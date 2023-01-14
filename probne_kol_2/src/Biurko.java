import java.time.LocalDate;

public class Biurko extends Mebel {
    public Biurko(String nazwa, double dlugosc, double szerokosc, Integer iloscNog, double przekatnaMonitora) {
        super(nazwa, dlugosc, szerokosc, iloscNog);
        this.przekatnaMonitora = przekatnaMonitora;
        this.dataProdukcji = LocalDate.now();
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }

    public void setDataProdukcji(int dzien, int miesiac, int rok) {
        if (dzien < 1 || dzien > 31) {dzien = LocalDate.now().getDayOfMonth();}
        if (miesiac < 1 || miesiac > 12) {miesiac = LocalDate.now().getMonthValue();}
        if (rok < 1900 || rok > LocalDate.now().getYear()) {rok = LocalDate.now().getYear();}
        this.dataProdukcji = LocalDate.of(rok, miesiac, dzien);
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Biurko [" +
                "dataProdukcji=" + dataProdukcji.getYear() + "-" + dataProdukcji.getMonthValue() + "-" + dataProdukcji.getDayOfMonth() +
                " " + dataProdukcji.getDayOfWeek().toString() + " " + dataProdukcji.getDayOfYear() +
                ", przekatnaMonitora=" + przekatnaMonitora +
                ']';
    }

    private LocalDate dataProdukcji;
    private double przekatnaMonitora;
}
