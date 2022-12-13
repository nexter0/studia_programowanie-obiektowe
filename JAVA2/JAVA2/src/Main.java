import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {
    public static Random r = new Random();
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();
        if((size < 1) || (size > 100))
            throw new Exception("Size must be in range [1; 100]");

        int[] array = new int[size];
        generate(array);

        for(int x : array) {
            System.out.print(x + " ");
        }

        System.out.print("\nOdd elements: " + howManyOdd(array));
        System.out.print("\nEven elements: " + howManyEven(array));
        System.out.print("\nPositive elements: " + howManyPositive(array));
        System.out.print("\nZero elements: " + howManyZeros(array));
        System.out.print("\nNegative elements: " + howManyNegative(array));
        System.out.print("\nBiggest element: " + max(array) + " repeated " + howManyMaxInstances(array) + " times");
        System.out.print("\nSum of positive numbers: " + sumOfPositive(array));
        System.out.print("\nSum of negative numbers: " + sumOfNegative(array));
        System.out.print("\nLongest sequence of positive numbers: " + longestPositiveSequence(array));
        reversePart(array, 1, 4);
        signum(array);
    }

    public static int getRandomNumber() {
        return Main.r.nextInt(1999) - 999;
    }

    public static void generate(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = Main.getRandomNumber();
        }
    }

    public static int howManyOdd(int[] array) {
        int result = 0;
        for (int x : array) {
            if (Math.abs(x) % 2 == 1) {
                result++;
            }
        }
        return result;
    }

    public static int howManyEven(int[] array) {
        return array.length - howManyOdd(array);
    }

    public static int howManyPositive(int[] array) {
        int result = 0;
        for (int x : array) {
            if (x > 0) {
                result++;
            }
        }
        return result;
    }

    public static int howManyZeros(int[] array) {
        int result = 0;
        for (int x : array) {
            if (x == 0) {
                result++;
            }
        }
        return result;
    }

    public static int howManyNegative(int[] array) {
        int result = 0;
        for (int x : array) {
            if (x < 0) {
                result++;
            }
        }
        return result;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static int howManyMaxInstances(int[] array) {
        int result = 1;
        int max = array[0];
        for (int x : array) {
            if (x == max) {
                result++;
            }
            if (x > max) {
                max = x;
                result = 1;
            }
        }
        return result;
    }

    public static int sumOfPositive(int[] array) {
        int result = 0;
        for (int x : array) {
            if (x > 0) {
                result += x;
            }
        }
        return result;
    }

    public static int sumOfNegative(int[] array) {
        int result = 0;
        for (int x : array) {
            if (x < 0) {
                result += x;
            }
        }
        return result;
    }

    public static int longestPositiveSequence(int[] array) {
        int counter = 0;
        int result = 0;
        for (int x : array) {
            if(x > 0)
                counter++;
            else
                if (counter > result) {
                    result = counter;
                    counter = 0;
                }
        }
        if (counter > result) {
            result = counter;
            counter = 0;
        }
        return result;
    }

    public static void signum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                array[i] = -1;
            if (array[i] > 0)
                array[i] = 1;
        }
        System.out.print("\n");
        System.out.println(Arrays.toString(array));
    }

    private static void checkIndex(int index, int[] array) throws Exception {
        if ((index < 1) || (index > array.length - 1))
            throw new Exception("Index " + index + " out of range.");
    }

    public static void reversePart(int[] array, int left, int right) throws Exception {
        checkIndex(left, array);
        checkIndex(right, array);
        while (left < right) {

            int temp = array[right];
            array[right] = array[left];
            array[left] = temp;

            left++;
            right--;
        }
        System.out.print("\n");
        System.out.println(Arrays.toString(array));
    }
}
// PEP8 WARNING NO NEWLINE AT END OF FILE!@!!11!
