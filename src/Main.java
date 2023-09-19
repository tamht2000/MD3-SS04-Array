import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        // Array - mảng là khái niệm dùng để lưu trữ danh sách các giá trị cùng kiểu dữ liệu
        // cú pháp: tường minh:
        int[] array = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));

        // cú pháp: sử dụng từ khoá new:
        int[] arrayInt = new int[10];
        System.out.println(Arrays.toString(arrayInt));
        // truy cập phần tử theo vị trí
        System.out.println("Phần tử tại vị trí index = 0 là: " + array[0]);
        // gán lại giá trị
        array[0] = 10;

        // duyệt mảng
        for (int i = 0; i < array.length; i++) { // duyệt theo index
            System.out.printf("Phần tử tại vị trí %d = 0 là: %d \n", i, array[i]);
        }

        // duyệt theo forEach : duyệt theo giá trị
        for (int value:array) {
            System.out.println(value);
        }

        // bài toán kiểm tra trong mảng và hiển thị các số chia hết cho 2
        System.out.println("các số chia hết cho 2");
        for (int value:array) {
            if (value % 2 ==0) {

                System.out.println(value);
            }

        }

        // Mảng 2 chiều là gì? Là mảng chứa danh sách các mảng khác
        int[][] array2Side = {
                {1,2,3},
                {4,5,6,7}
        };
        for (int[] arr: array2Side) {
            System.out.println(Arrays.toString(arr));
        }

//        int [][] arr2Side = new int[3][4];
        int [][] arr2Side = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        for (int[] arr: arr2Side) {
            System.out.println(Arrays.toString(arr));
        }

        // duyệt theo ma trận
        for (int i = 0; i < arr2Side.length; i++) {
            for (int j = 0; j < arr2Side[i].length; j++) {
                System.out.printf("%2d ", arr2Side[i][j]);
            }
            System.out.println();
        }

        // bài toán nhập xuất dữ liệu mảng 2 chiều
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số hàng");
        int m = sc.nextInt();
        System.out.println("nhập vào số cột");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        //nhập lần lượt giá trị cho mảng
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("nhập giá trị cho matrix[%d][%d] = ",i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("các giá trị vừa nhập là");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-5d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}