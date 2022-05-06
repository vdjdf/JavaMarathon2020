package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0 ) {
                System.out.print("Деление на 0");
                continue;
            }
            System.out.print(a / b + "\n");




        }
    }
}
