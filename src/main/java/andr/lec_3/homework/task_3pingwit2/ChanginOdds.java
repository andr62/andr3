package andr.lec_3.homework.task_3pingwit2;

import java.util.Arrays;

public class ChanginOdds {
    public static void main(String[] args) {
        int[] array = new int[10];
        int oddNumbers = 0;
        int evenNumbers = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = i;
            if (i % 2 != 0)
                i = 0;
            System.out.println(Arrays.toString(array));
        }

    }
}
