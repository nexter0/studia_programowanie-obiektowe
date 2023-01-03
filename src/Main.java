import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(2);
        list1.add(4);
        list1.add(2);
        list1.add(4);
        list1.add(2);
        list1.add(4);
        list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);


        ArrayList<Integer> list3 = append(list1, list2);
        ArrayList<Integer> list4 = merge(list1, list2);
        System.out.println(list4);
        System.out.println(reversed(list4));
        reverse(list4);
        System.out.println(list4);

    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> newArrayList = new ArrayList<>(a);
        newArrayList.addAll(b);
        return newArrayList;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> newArrayList = new ArrayList<>();

        if (a.size() <= b.size()) {
            int i;
            for (i = 0; i < a.size(); i++) {
                newArrayList.add(a.get(i));
                newArrayList.add(b.get(i));
            }
            if (a.size() < b.size()) {
                for (int j = i; j < b.size(); j++) {
                    newArrayList.add(b.get(j));
                }
            }
        }

        if (a.size() > b.size()) {
            int i;
            for (i = 0; i < b.size(); i++) {
                newArrayList.add(a.get(i));
                newArrayList.add(b.get(i));
            }
                for (int j = i; j < a.size(); j++) {
                    newArrayList.add(a.get(j));
                }
        }

        return newArrayList;
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> newArrayList;
        newArrayList = merge(a, b);
        Collections.sort(newArrayList);
        return newArrayList;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a) {

        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            newArrayList.add(a.get(i));
        }
        return newArrayList;
    }

    public static void reverse(ArrayList<Integer> a) {

        ArrayList<Integer> temp;
        temp = reversed(a);
        for (int i = 0; i < a.size(); i++) {
            a.set(i, temp.get(i));
        }
    }
}


