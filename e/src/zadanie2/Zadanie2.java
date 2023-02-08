package zadanie2;

import java.util.ArrayList;

public class Zadanie2 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(5);
        array1.add(1);
        array1.add(9);
        array1.add(11);
        array1.add(8);
        array1.add(5);
        array1.add(16);
        array1.add(13);
        array1.add(15);
        array1.add(2);
        System.out.println(max(array1));
        ArrayList<String> array2 = new ArrayList<>();
        array2.add("aaaa");
        array2.add("cccc");
        array2.add("ffff");
        array2.add("dddd");
        array2.add("acac");
        array2.add("fafa");
        array2.add("daad");
        System.out.println(max(array2));
    }

    public static <T extends Comparable<T>> T max(ArrayList<T> arr) {
        T max = arr.get(0);
        for (int i = 1; i < arr.size() - 1; i++) {
            if (arr.get(i).compareTo(max) > 0)
                max = arr.get(i);
        }
        return max;
    }
}
