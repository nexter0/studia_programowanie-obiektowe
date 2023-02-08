package zadanie1;

import java.util.ArrayList;
import java.util.Comparator;

public class CordlessVacuumCleanerDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        VacuumCleaner p = new CordlessVacuumCleaner("Elektorlux", 1729);
        System.out.println(p.getName());
        CordlessVacuumCleaner s = (CordlessVacuumCleaner) p;
        System.out.println(s.getName());

        zadanie1.Named n = s;
        System.out.println(n.getName());
        zadanie1.CordlessVacuumCleaner d = s.clone();
        System.out.println(d.getName());
        System.out.println(d);

        ArrayList<zadanie1.CordlessVacuumCleaner> odkurzacze = new ArrayList<>();
        odkurzacze.add(new zadanie1.CordlessVacuumCleaner("Samsung", 10));
        odkurzacze.add(new zadanie1.CordlessVacuumCleaner("Dyson", 100));
        odkurzacze.add(new zadanie1.CordlessVacuumCleaner("Bosh", 1000));

        odkurzacze.sort(new NamesComparator());

        System.out.println();
        for (zadanie1.CordlessVacuumCleaner e : odkurzacze) {
            System.out.println("Firma = " + e.getName() + ", id = " + e.getId());
        }
        System.out.println();
    }
}

class NamesComparator implements Comparator<CordlessVacuumCleaner> {
    @Override
    public int compare(CordlessVacuumCleaner o1, CordlessVacuumCleaner o2) {
        return o1.getName().compareTo(o2.getName());
    }
}