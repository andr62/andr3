package pingwit.lec_3.hm.task_1pingwit2;


import java.util.Arrays;
import java.util.Scanner;

public class ScannerMain {
        public static void main(String[] args) {
            int[] array = new int[3];
            int biggestOne = 0;
            int smallestOne = 0;
            int i; //обычно i не выносится из оператора for, даже если несколько раз используется
            for (i = 0; i < array.length; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter any number: ");
                array[i] = scanner.nextInt(); // fullfillin an array w user entered
                smallestOne = array[0]; //это можно вынести из цикла, т.к. выполняется одна и та же операция, которая не зависит от i
//Удаляем ненужные пустые строки
            }

            System.out.println(Arrays.toString(array)); // printin an array fullfilled by the user
            //В этом блоке идет сравнение значения элемента с размером массива. На одном наборе данных будут разные ответы. Проверь на 1,2,3 и 3,2,1
            for (i = 1; i < array.length; i++) {
                if (smallestOne > array.length)
                    smallestOne = array[i];
                else biggestOne = array[i];
            }
            //В задаче было ещё сказано вывести сумму
            System.out.println("The smallest number is: " + smallestOne);
            System.out.println("The biggest number is: " + biggestOne);
        }
    }
