import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int size = scan.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Element %d: ", i);
            int x = scan.nextInt();
            list[i] = x;
        }
        System.out.println(Arrays.toString(list));
        System.out.printf("Sum: %d\n", sum(list, size));
        System.out.printf("Product: %d\n", prod(list, size));
        System.out.printf("Absolute sum: %d\n", absSum(list, size));
        System.out.printf("Sum of squares of absolute values: %f\n", sqrtAbsSum(list, size));
        System.out.printf("Absolute product: %d\n", absProd(list, size));
        System.out.printf("Sum of squares: %d\n", sqrtSum(list, size));
        System.out.printf("Every second negative: %d\n", esnSum(list, size));
        printFirstToLast(list, size);
        System.out.printf("Odd numbers: %d\n", countOdd(list, size));
        System.out.printf("Divisible by 3 but not by 5: %d\n", countDivisible(list, size));
        System.out.printf("Perfect squares: %d\n", countPerfectSquares(list, size));
        System.out.printf("Element is mean: %d\n", countIsMean(list, size));
        System.out.printf("Non negative odd numbers: %d\n", countNonNegOdd(list, size));
        System.out.printf("Absolute less than square: %d\n", absLtSqrt(list, size));
    }

    public static int sum(int[] list, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += list[i];
        }
        return result;
    }

    public static int prod(int[] list, int size) {
        int result = 1;
        for (int i = 0; i < size; i++) {
            result *= list[i];
        }
        return result;
    }

    public static int absSum(int[] list, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += Math.abs(list[i]);
        }
        return result;
    }

    public static double sqrtAbsSum(int[] list, int size) {
        double result = 0;
        for (int i = 0; i < size; i++) {
            result += Math.sqrt(Math.abs(list[i]));
        }
        return result;
    }

    public static int absProd(int[] list, int size) {
        int result = 1;
        for (int i = 0; i < size; i++) {
            result *= Math.abs(list[i]);
        }
        return result;
    }

    public static int sqrtSum(int[] list, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += Math.pow(list[i], 2);
        }
        return result;
    }

    public static int esnSum(int[] list, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                result += Math.pow(list[i], 2);
            }
            if (i % 2 != 0) {
                result -= Math.pow(list[i], 2);
            }
        }
        return result;
    }

    public static void printFirstToLast(int[] list, int size) {
        System.out.print("[");
        for (int i = 1; i < size; i++) {
            System.out.printf(" %d ", list[i]);
        }
        System.out.printf(" %d ", list[0]);
        System.out.print("]\n");
    }

    public static int countOdd(int[] list, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            if (list[i] % 2 == 1) {
                result += 1;
            }
        }
        return result;
    }

    public static int countDivisible(int[] list, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            if ((list[i] % 3 == 0) && (list[i] % 5 != 0)) {
                result += 1;
            }
        }
        return result;
    }

    public static int countPerfectSquares(int[] list, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            double square = Math.sqrt(list[i]);
            double square_f = Math.floor(square);
            if (square - square_f == 0) {
                result += 1;
            }
        }
        return result;
    }

    public static int countIsMean(int[] list, int size) {
        int result = 0;
        for (int i = 1; i < size - 1; i++) {
            if ((list[i - 1] + list[i + 1]) / 2 > list[i]) {
                result += 1;
            }
        }
        return result;
    }

    public static int countNonNegOdd(int[] list, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            if ((list[i] % 2 == 1) && (list[i] >= 0)) {
                result += 1;
            }
        }
        return result;
    }

    public static int absLtSqrt(int[] list, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            if (Math.abs(list[i]) < Math.pow(list[i], 2)) {
                result += 1;
            }
        }
        return result;
    }

}