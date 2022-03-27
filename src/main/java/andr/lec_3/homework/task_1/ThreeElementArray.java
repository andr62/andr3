package andr.lec_3.homework.task_1;

import java.util.Arrays;

public class ThreeElementArray {
    public static void main(String[] args) {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 0;
        }
        System.out.println(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array));
    }
}
