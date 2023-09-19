package ra.bt2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Scanner sc = new Scanner(System.in);

        // Bước 1: Nhập số cần chèn
        System.out.print("Nhập số muốn chèn: ");
        int n = sc.nextInt();

        // Bước 2: Nhập vị trí cần chèn
        System.out.print("Nhập vị trí cần chèn: ");
        int index = sc.nextInt();

        // Kiểm tra điều kiện để chèn
        if (index < 0 || index > arr.length) {
            System.out.println("Không chèn được");
        } else {
            // Tạo mảng mới có kích thước lớn hơn một đơn vị
            int[] newArr = new int[arr.length + 1];

            // Bước 3: Sao chép phần tử từ mảng ban đầu đến vị trí chèn
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }

            // Bước 4: Chèn số vào vị trí cần chèn
            newArr[index] = n;

            // Bước 5: Sao chép phần tử từ vị trí chèn trở đi
            for (int i = index; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }

            // Gán mảng mới cho mảng ban đầu
            arr = newArr;

            // In ra mảng mới sau khi chèn
            System.out.println("Mảng mới sau khi chèn: " + Arrays.toString(arr));
        }

        sc.close();
    }
}
