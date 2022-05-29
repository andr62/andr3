package andr.lec_2.homework.task_7;

public class EvenNumbers2 {
    public static void main(String[] args) {
        double evenNumber = 1;
        double countingStarts = 0;
        for (evenNumber = 0; evenNumber <= 100; evenNumber++) {
            if (evenNumber % 2 != 0) {
                System.out.println("Printing even numbers:");
                System.out.println(evenNumber);
                countingStarts = evenNumber + countingStarts;
                System.out.println(countingStarts);
            }
        }

    }
}
