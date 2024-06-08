package com.example;

import org.apache.commons.math3.util.ArithmeticUtils;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть операцію: додавання (+), віднімання (-), множення (*), ділення (/)");
        String operation = scanner.nextLine();

        System.out.println("Введіть перше число:");
        int num1 = scanner.nextInt();

        System.out.println("Введіть друге число:");
        int num2 = scanner.nextInt();

        int result = 0;

        switch (operation) {
            case "+":
                result = ArithmeticUtils.addAndCheck(num1, num2);
                break;
            case "-":
                result = ArithmeticUtils.subAndCheck(num1, num2);
                break;
            case "*":
                result = ArithmeticUtils.mulAndCheck(num1, num2);
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ділення на нуль неможливе!");
                    return;
                }
                break;
            default:
                System.out.println("Невідома операція.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}