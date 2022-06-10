package pingwit.lec_3.hm.task_7pingwit2;

import java.util.Arrays;

//+-
public class UnsortedMassive {
    public static void main(String[] args) {
        int[] unsortedArray = {5, 85, 45, 77, 100500, 345, 1237, 1102};
        System.out.println(Arrays.toString(unsortedArray));
        boolean needToSort = false;
        int temp = 0;
        while (!needToSort) {
            needToSort = true; //наоборот:D мы предполагаем, что сортировать больше не надо
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = temp;
                    needToSort = false; //а тут говорим, что мы сделали один обменя значит нужно ещё раз будет проверить массив
                }
            }
        }

        System.out.println(Arrays.toString(unsortedArray));
//Лишняя пустая строка 
    }
}
