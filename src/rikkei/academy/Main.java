package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số dòng và số cột của mảng
        System.out.print("Nhập số dòng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        // Khai báo và khởi tạo mảng
        double[][] arr = new double[rows][cols];

        // Nhập vào các phần tử của mảng
        System.out.println("Nhập vào các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextDouble();
            }
        }

        // Nhập vào cột cần tính tổng
        System.out.print("Nhập vào số thứ tự của cột : ");
        int colIndex = scanner.nextInt();

        // Tính tổng các phần tử của cột
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += arr[i][colIndex];
        }

        // In ra kết quả
        System.out.println("Tổng các phần tử của cột " + colIndex + " là " + sum);
    }
}
