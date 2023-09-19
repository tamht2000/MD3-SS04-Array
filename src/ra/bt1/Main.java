package ra.bt1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ký tự muốn xóa: ");
        int n = sc.nextInt();
        int indexDelete = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                indexDelete = i;
                break;
            }
        }
        if(indexDelete != -1){
            for (int i = indexDelete; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr = Arrays.copyOf(arr,arr.length - 1);
            System.out.println(Arrays.toString(arr));
        }else{
            System.out.println("Không tìm thấy phần tử trong mảng");
        }
    }
}
