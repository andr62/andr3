package andr.lec_3.homework.task_2pingwit2;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sumOfAllNumbers = 0;
        for ( int i = 0; i < array.length; i++) {
            array[i] = i;
            sumOfAllNumbers = sumOfAllNumbers + array[i];
            int average = sumOfAllNumbers / array.length;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sumOfAllNumbers);
    }
}
