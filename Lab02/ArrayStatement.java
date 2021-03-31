package Lab02;

import java.util.Scanner;

public class ArrayStatement {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        // Kiểm tra điều kiện nhập n;
        do {
            System.out.println("Enter number : ");
            n = keyboard.nextInt();
        } while (n <= 0);

        // Khởi tạo mảng n phần tử và nhập giá trị cho mảng
        int[] arr = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = keyboard.nextInt();
        }
        sortASC(arr);
        System.out.println("Mảng đã được sắp xếp : ");
        show(arr);

    }

    // Sắp xếp mảng theo thứ tự tăng dần
    public static void sortASC(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    // Hiển thị ra màn hình
    public static void show(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]  + "\t");
        }
    }
}
// Lưu ý : bài này em ngồi bug lỗi mãi đoạn chỉ mục.
// Không đánh : int i = 0; i <= n; i++
// Nên : it i = 0; i < n -1 ; i++