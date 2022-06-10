package pingwit.lec_3.hm.task_5pingwit2;

import java.util.Arrays;

//+
public class InvertingMassive {
    public static void main(String[] args) {
        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
//Лишняя пустая строка

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array.length - 1 - i; //больше похоже на индекс симметричного элемента
            int reversed = array[i]; //больше похож на temp
            array[i] = array[temp];
            array[temp] = reversed;
        }

    System.out.println(Arrays.toString(array));
//Лишняя пустая строка
    }
}

