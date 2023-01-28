import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtil {
    public static <T extends Comparable<T>> boolean isSorted(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i+1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <E> void addAllListExt(ArrayList<? extends E> source, ArrayList<E> destination) {
        destination.addAll(source);
    }

    public static <E> void addAllListSup(ArrayList<E> source, ArrayList<? super E> destination) {
        destination.addAll(source);
    }

    public static <T extends Comparable<T>> int binSearch(T[] arr, T val) {
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            T value = arr[middle];

            if (value.compareTo(val) < 0) {
                low = middle + 1;
            }
            else if (value.compareTo(val) > 0) {
                low = middle - 1;
            }
            else return middle;
        }
        return -1;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

}
