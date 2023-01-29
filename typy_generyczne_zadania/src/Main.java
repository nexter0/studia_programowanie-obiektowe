import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Pair<Integer> intPair = new Pair<>(1, 3);
        System.out.println(intPair);
        intPair.swap();
        System.out.println(intPair);

        Pair<Double> doublePair = new Pair<>(1.5, 3.9);
        System.out.println(doublePair);
        doublePair.swap();
        System.out.println(doublePair);

        Pair<String> stringPair = new Pair<>("agata", "renata");
        System.out.println(stringPair);
        stringPair = PairUtil.swap(stringPair);
        System.out.println(stringPair);

        Integer[] array1 = new Integer[]{1, 2, 3, 4, 5};
        Integer[] array2 = new Integer[]{1, 2, 4, 4, 5};
        Integer[] array3 = new Integer[]{1, 2, 123, 4, 5};

        System.out.println(ArrayUtil.isSorted(array1));
        System.out.println(ArrayUtil.isSorted(array2));
        System.out.println(ArrayUtil.isSorted(array3));

        LocalDate[] array4 = new LocalDate[]{LocalDate.of(1987, 11, 27), LocalDate.of(1997, 10, 11)};
        LocalDate[] array5 = new LocalDate[]{LocalDate.of(1997, 10, 11), LocalDate.of(1987, 11, 27)};

        System.out.println(ArrayUtil.isSorted(array4));
        System.out.println(ArrayUtil.isSorted(array5));

        System.out.println(ArrayUtil.binSearch(array3, 123));
        System.out.println(ArrayUtil.binSearch(array4, LocalDate.of(1987, 11, 27)));

        ArrayUtil.selectionSort(array3);
        System.out.println(ArrayUtil.isSorted(array3));
        System.out.println(Arrays.toString(array3));

        Integer[] array6a = new Integer[]{1, 2, 3, 2, 1};
        Integer[] array6b = new Integer[]{1, 2, 3, 3, 2, 1};
        Integer[] array6c = new Integer[]{1, 2, 3, 3, 1};
        Integer[] array6d = new Integer[]{1, 2, 3, 4, 2, 1};
        System.out.println("========================");
        System.out.println(ArrayUtil.isPalindrome(array6a));
        System.out.println(ArrayUtil.isPalindrome(array6b));
        System.out.println(ArrayUtil.isPalindrome(array6c));
        System.out.println(ArrayUtil.isPalindrome(array6d));
    }
}