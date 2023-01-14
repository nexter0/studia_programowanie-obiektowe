public class Main {
    public static void main(String[] args) {

        Mebel maly = new Mebel("Maly Mebel", 1, 0.5, 4);
        System.out.println(maly.toString());
        System.out.println(Mebel.getIle());
        Mebel sredni = new Mebel(2, 1, 4);
        System.out.println(sredni.toString());

        Biurko maleBiurko = new Biurko("Male Biurko", 2, 1, 4, 22);
        System.out.println(maleBiurko.toString());
        maleBiurko.setDataProdukcji(28, 2, 2005);
        System.out.println(maleBiurko.toString());
        System.out.println(Mebel.getIle());

        Mebel[][] spis = new Mebel[2][2];
        spis[0][0] = sredni;
        spis[0][1] = maly;
        spis[1][0] = maleBiurko;
        spis[1][1] = sredni;

        // wypisz tablicę dwuwymiarową spis
        for (int i = 0; i < spis.length; i++) {
            for (int j = 0; j < spis[i].length; j++) {
                System.out.println(spis[i][j].toString());
            }
        }

        System.out.println();

        String[] spisNazw = new String[4];
        spisNazw[0] = sredni.getNazwa();;
        spisNazw[1] = maly.getNazwa();
        spisNazw[2] = maleBiurko.getNazwa();
        spisNazw[3] = sredni.getNazwa();

        // stosując instrukcję foreach wypisz wszystkie obiekty z tablicy spis
        for (Mebel[] wewnetrzna : spis) {
            for (Mebel mebel : wewnetrzna) {
                System.out.println(mebel.toString());
            }
        }
        System.out.println(maly.equals(maleBiurko));

        int biurka = 0;
        for (Mebel[] wewnetrzna : spis) {
            for (Mebel mebel : wewnetrzna) {
                if (mebel.getClass() == Biurko.class) {
                    biurka++;
                }
            }
        }
        System.out.println("Ilosc biurek: " + biurka);

        for (int i = 0; i < spis.length; i++) {
            for (int j = 0; j < spis[i].length; j++) {
                System.out.print(spis[i][j].getClass().toString());
                if (i != (spis.length - 1) || j != (spis[i].length - 1)) {System.out.print(", ");}
            }
        }
    }
}