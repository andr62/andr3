package andr.lec_3.homework.task_1;

import java.util.Scanner;

public class ScannerHome {
    public static void main(String[] args) {
        int tot, i, small;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");

        tot = scan.nextInt();

        int[] arr = new int[tot];

        System.out.print("Enter " +tot+ " Numbers: ");

        for(i=0; i<tot; i++) {
            arr[i] = scan.nextInt();
        }

        small = arr[0];
        for(i=1; i<tot; i++) {
            if(small>arr[i])
                small = arr[i];
        }

        System.out.println("Smallest Number = " +small);
    }
}
