import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] agrs) {
//        System.out.println("Hello");
//        SpeedConverter speedConverter = new SpeedConverter();
//        double number = 95.75;
//        System.out.println(speedConverter.toMilesPerHour(number));
//        int[] myIntArray = new int[10];
//        int[] myIntArray = new int[15];//{1,2,3,4,5,6,7,8,9,10};
//        for(int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        for(int i = 0; i < myIntArray.length; i++) {
//            System.out.println(i + " : " + myIntArray[i]);
//        }
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("-------------------");
        printArray(sortIntegers(myIntegers));
        System.out.println("-------------------");
        System.out.println(Arrays.toString(myIntegers));
        System.out.println("-------------------");
        double avg = getAverage(myIntegers);
        System.out.println("Average: " + avg);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter number " + number + "times: ");
        int[] values = new int[number];
        for(int i=0; i < number; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }

    public static void printArray(int[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.println("Element: " + i + " - value: " + array[i]);
//            System.out.println(array[i]);
        }
    }


    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        // copy to a new array
        for(int i=0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i < sortedArray.length -1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
