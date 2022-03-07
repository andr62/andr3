public class BubbleSort {public static public static void main(String[] args) {
    int[] arrayToSort = {2, 3, 4, 1};

    for (int i = 0; i < arrayToSort.length; i++) {
        if (arrayToSort[i] > arrayToSort[i + 1]) {
            //swap
            int tmp = arrayToSort[i + 1];
            arrayToSort[i + 1] = arrayToSort[i];
            arrayToSort[i] = tmp;
        }
    } system.out.println(Arrays.toString(arrayToSort));

}
