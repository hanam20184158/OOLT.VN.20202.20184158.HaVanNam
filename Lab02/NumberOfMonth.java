package Lab02;

import java.util.Scanner;

public class NumberOfMonth {
    public static void main(String[] args) {
        int month;
        int year;
        Scanner keyboard = new Scanner(System.in);
        // Kiểm tra nhập tháng có từ 1 - 12 và năm có thỏa mãn dương không .
        do {

            System.out.println("Nhập tháng : ");
            month = keyboard.nextInt();
            System.out.println("Nhập năm :");
            year = keyboard.nextInt();
        } while (month <= 0 || month >= 12 || year <= 0);
        // tính số ngày trong các tháng của từng năm nhập vào
        switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("Tháng " + month + " năm " + year + " có 31 ngày.");
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("Tháng " + month + " năm " + year + " có 30 ngày.");
            break;
        case 2:
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Tháng " + month + " năm " + year + " có 29 ngày.");
                    } else {
                        System.out.println("Tháng " + month + " năm " + year + " có 28 ngày.");
                    }
                } else {
                    System.out.println("Tháng " + month + " năm " + year + " có 29 ngày.");
                }
            } else {
                System.out.println("Tháng " + month + " năm " + year + " có 28 ngày.");
            }
        }
    }
}
