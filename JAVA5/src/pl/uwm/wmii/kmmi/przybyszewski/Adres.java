package pl.uwm.wmii.kmmi.przybyszewski;

public class Adres {

    public Adres(String ulica, int numerDomu, int numerMieszkania, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, int numerDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = 0;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public void pokaz() {
        System.out.println(kodPocztowy + ", " + miasto);
        if (numerMieszkania !=0) {
            System.out.println(ulica + " " + numerDomu + " " + numerMieszkania);
        }
        else {
            System.out.println(ulica + " " + numerDomu);
        }
    }


    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }

    public int getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(int numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    private String ulica;
    private int numerDomu;
    private int numerMieszkania;
    private String miasto;
    private String kodPocztowy;
}
