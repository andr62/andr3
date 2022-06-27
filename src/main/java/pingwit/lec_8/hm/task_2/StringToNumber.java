package pingwit.lec_8.hm.task_2;

//    Task 2
//    Написать метод, который бы парсил строку в число, обработать исключение, которое может быть при неверном формате числа

public class StringToNumber {

    public static void main(String[] args) {

        int myInt = 0;
        try {

            myInt = Integer.parseInt("9");
            int nextInt = Integer.parseInt("not a number");


        } catch (NumberFormatException e) {
            System.out.println("Exception caught");
            System.out.println("Printing myInt: " + myInt);
        }
    }
}
