package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (x >= 1 && x <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (x >= 5 && x <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (x >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }

    }
}