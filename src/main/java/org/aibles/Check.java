package org.aibles;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập một số từ bàn phím
        System.out.print("Nhập vào một số nguyên: ");
        int number = scanner.nextInt();

        // Kiểm tra số chẵn lẻ
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }

        // Đóng scanner
        scanner.close();
    }
}
