package pingwit.lec_8.hm.task_3;

//Task 3
//Попросите пользователя ввести число размера будущего массива, но не больше размера Y (задайте сами).
//Если пользователь ввел число больше Y или отрицательное, то выбросьте собственное исключение и
//попросите пользователя ввести число заново.

import java.util.Arrays;
import java.util.Scanner;

public class UsersArrayException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

        System.out.println("Please enter an array size between 0 to 100:");
        int arrayLength = scanner.nextInt();

        int[] usersArray = new int[arrayLength];

        System.out.println(Arrays.toString(usersArray));

        } catch (Exception e) {
            System.out.println("Test");
        }
    }
}
