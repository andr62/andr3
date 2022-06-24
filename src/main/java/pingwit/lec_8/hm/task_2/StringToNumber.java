package pingwit.lec_8.hm.task_2;

//+- В задании указано создать метод, а тут вся реализация в main. +Постарайся оставлять меньше пустых строк 
//    Task 2
//    Написать метод, который бы парсил строку в число, обработать исключение, которое может быть при неверном формате числа

public class StringToNumber {

    public static void main(String[] args) {

        int myInt = 0; //не совсем понятно, почему он тут
        try {

            myInt = Integer.parseInt("9");
            int nextInt = Integer.parseInt("Lol");


        } catch (NumberFormatException e) {
            System.out.println("Do u really think it is a number??");
            System.out.println(myInt); //myInt будет просто 9. Если идея была выводить, что ввел юзер, попробуй через scanner.next() и Integer.parseInt(). переменную с next можно вынести из try и его печатать
        }
    }
}
