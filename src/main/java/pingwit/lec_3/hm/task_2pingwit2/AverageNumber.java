package pingwit.lec_3.hm.task_2pingwit2;

import java.util.Arrays;

//+- код не отформатирован 
public class AverageNumber {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sumOfAllNumbers = 0;
        int average = 0;
        for ( int i = 0; i < array.length; i++) {
            array[i] = i + 3;
            sumOfAllNumbers = sumOfAllNumbers + array[i];
            average = sumOfAllNumbers / array.length; //промежуточные результаты нигде не используются (на i=0,1...). Может быть вынесено из цикла
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sumOfAllNumbers);
        System.out.println((average)); //лишние скобки
    }
}
