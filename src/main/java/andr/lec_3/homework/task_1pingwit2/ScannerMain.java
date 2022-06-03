package andr.lec_3.homework.task_1pingwit2;


import java.util.Arrays;
import java.util.Scanner;

public class ScannerMain {
        public static void main(String[] args) {
            int[] array = new int[3];
            int biggestOne = 0;
            int smallestOne = 0;
            int i;
            for (i = 0; i < array.length; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter any number: ");
                array[i] = scanner.nextInt(); // fullfillin an array w user entered
                smallestOne = array[0];

            }

            System.out.println(Arrays.toString(array)); // printin an array fullfilled by the user
            for (i = 1; i < array.length; i++) {
                if (smallestOne > array.length)
                    smallestOne = array[i];
                else biggestOne = array[i];
            }
            System.out.println("The smallest number is: " + smallestOne);
            System.out.println("The biggest number is: " + biggestOne);
        }
    }
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ScannerMain {
//
//        public static void main(String[] args) {
//                int i, arraySize = 0;
//                int smallestOne = 0;
//                int biggestOne = 0;
//
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.print("Enter a size of an Array: ");
//
//                arraySize = scanner.nextInt();
//                int[] array = new int[arraySize];
//
//                System.out.println("The size of an Array will be: " + arraySize);
//                System.out.println("Now enter any " + arraySize + " numbers: ");
//
//                for ( i = 0; i < arraySize; i++) {
//                        array[i] = scanner.nextInt();
//                }
//                System.out.println("Printin an Array you created: " + Arrays.toString(array));
//        }
//
//}
