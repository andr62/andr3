package andr.lec_3.homework.task_1;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeElementArray {
    public static void main(String[] args) {

        int[] array = new int[3];
 //       int numberFromInPut = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter you number: ");
            int numberFromInPut = scanner.nextInt();
            String name = scanner.next();
            String number1entered = scanner.toString();
            numberFromInPut = numberFromInPut + scanner.nextInt();
            System.out.println(Arrays.stream(array));

            // System.out.println(Arrays.toString(i * i if i < 2 ));
        }
        // System.out.println(array);
        //  InputStream = System.in;
        //      System.out.println(Arrays.toString(array));
//        Integer.parseInt();
        System.out.println("The sum of your choices will be: " + System.in);
    }
}
