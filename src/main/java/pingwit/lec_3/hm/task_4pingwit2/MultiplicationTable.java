package pingwit.lec_3.hm.task_4pingwit2;

//+
public class MultiplicationTable {
    public static void main(String[] args) {
//        int tableSize = 5; <- удаляем ненужные комментарии 
        int[][] array = new int[11][11]; //попробуй сделать через массив размера 9х9 

        for (int a = 1; a < array.length; a++) {
            for (int b = 1; b < array[a].length; b++) {
                array[a][b] = a * b;
            }
        }
        for (int[] row : array) {
            for (int element : row) {
                if (element < 10) {
                    System.out.print(' ');
                }
                System.out.print(" " + element);
            }
            System.out.println();
        }
    }
}
