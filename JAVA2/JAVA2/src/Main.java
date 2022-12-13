import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();
        if((size < 1) || (size > 100))
            throw new Exception("Size must be in range [1; 100]");

        int[] array = new int[size];
        generate(array);

        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nOdd elements: " + howManyOdd(array));
        System.out.print("\nEven elements: " + howManyEven(array));
        System.out.print("\nPositive elements: " + howManyPositive(array));
        System.out.print("\nZero elements: " + howManyZeros(array));
        System.out.print("\nNegative elements: " + howManyNegative(array));
        System.out.print("\nBiggest element: " + max(array) + " repeated " + howManyMaxInstances(array) + " times");
        System.out.print("\nSum of positive numbers: " + sumOfPositive(array));
        System.out.print("\nSum of negative numbers: " + sumOfNegative(array));
    }

    public static int getRandomNumber(int min, final int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void generate(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = Main.getRandomNumber(-999, 1000);
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
        for(int x : array) {
            if (x > 0) {
                result++;
            }
        }
        return result;
    }

    public static int howManyZeros(int[] array) {
        int result = 0;
        for(int x : array) {
            if (x == 0) {
                result++;
            }
        }
        return result;
    }

    public static int howManyNegative(int[] array) {
        int result = 0;
        for(int x : array) {
            if (x < 0) {
                result++;
            }
        }
        return result;
    }

    public static int max(int[] array) {
        int max = array[0];
        for(int x : array) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static int howManyMaxInstances(int[] array) {
        int result = 1;
        int max = array[0];
        for(int x : array) {
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
        for(int x : array) {
            if (x > 0) {
                result += x;
            }
        }
        return result;
    }

    public static int sumOfNegative(int[] array) {
        int result = 0;
        for(int x : array) {
            if (x < 0) {
                result += x;
            }
        }
        return result;
    }

}
// PEP8 WARNING NO NEWLINE AT END OF FILE!@!!!!!!!