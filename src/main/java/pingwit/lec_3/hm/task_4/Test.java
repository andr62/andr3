package pingwit.lec_3.hm.task_4;

public class Test {
    public static void main(String[] args) {


        System.out.println("Таблица Умножения");


        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d",i * j);
            }
            System.out.println();
        }
    }
}