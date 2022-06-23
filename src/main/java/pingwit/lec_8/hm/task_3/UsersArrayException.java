package pingwit.lec_8.hm.task_3;

//Task 3
//Попросите пользователя ввести число размера будущего массива, но не больше размера Y (задайте сами).
//Если пользователь ввел число больше Y или отрицательное, то выбросьте собственное исключение и
//попросите пользователя ввести число заново.

import java.util.Scanner;

public class UsersArrayException {
    public static void main(String[] args) throws CustomException {

        int maxSize = 100;
        int minSize = 0;
        boolean tryAgain = true;

        System.out.println("Please enter an array size as a positive number between 0 to 100:");

        Scanner scanner = new Scanner(System.in);

        do {
            try {

                int arrayLength = scanner.nextInt();

//                if (arrayLength < minSize) {
//                    throw new CustomException("You should've entered a specific number!");
//                }

                if (arrayLength > maxSize | arrayLength < minSize) {
                    throw new CustomException("You should've entered a specific number!");
                }

                int[] usersArray = new int[arrayLength];
                int i = 0;


//
//                if (usersArray.length < minSize) {
//
//                    throw new CustomException("An array can't be of a negative size!");

                tryAgain = false;

            } catch (CustomException e) {

                String string = e.getMessage();
                System.out.println(string);
            }
        } while (tryAgain);

        System.out.println("AT LAST!");
    }
}

