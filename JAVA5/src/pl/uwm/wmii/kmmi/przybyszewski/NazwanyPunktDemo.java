package pl.uwm.wmii.kmmi.przybyszewski;


import java.util.Objects;

public class NazwanyPunktDemo
{

    public static void main(String[] args)
    {
        NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
        a.show();
        Punkt b = new Punkt(3, 5);
        b.show();
        Punkt c = new NazwanyPunkt(3, 6, "tawerna");
        c.show();
        // a = b;                // --- powoduje błąd kompilacji  (dlaczego ?)
        // a = (NazwanyPunkt) b;  //--- powoduje błąd wykonania   (dlaczego ?)
        //a = c;                // --- powoduje błąd kompilacji  (dlaczego ?)
        a = (NazwanyPunkt) c;
        a.show();
    }

}

class Punkt
{

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punkt punkt = (Punkt) o;
        return x == punkt.x && y == punkt.y;
    }

    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void show()
    {
        System.out.println("<" + x + ", " + y + ">");
    }

    public int x()
    {
        return x;
    }

    public int y()
    {
        return y;
    }

    private int x, y;
}

class NazwanyPunkt extends Punkt
{

    NazwanyPunkt(int x, int y, String name)
    {
        super(x, y);
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof NazwanyPunkt) {
            return super.equals(o) && name.equals(((NazwanyPunkt) o).name);
        }
        return false;
    }

    public void show()
    {
        System.out.println(name + ":<" + x() + ", " + y() + ">");
    }

    private final String name;
}
