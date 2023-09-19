package ra.bt3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("nhập số :");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("nhập số :");
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[6];
        for(int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i+3] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
