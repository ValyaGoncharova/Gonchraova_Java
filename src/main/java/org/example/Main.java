package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tasks number_of_task = new Tasks();
        number_of_task.task1();
        number_of_task.task2();
        number_of_task.task3();
    }
}
class Tasks {
    public void task1 () {
        System.out.println("Задание 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число a:");
        Integer a = scanner.nextInt();
        System.out.println("Введите целое число b:");
        Integer b = scanner.nextInt();
        System.out.println("Сравнение a и b:");
        if (a > b) {
            System.out.println("a > b");
        }
        else if (a < b) {
            System.out.println("a < b");
        }
        else {
            System.out.println("a = b");
        };
        Integer sum = a + b;
        System.out.println("a + b = " + sum);
        Integer sub = 0;
        if (a >= b) {
            sub = a - b;
            System.out.println("a - b = " + sub);
        } else {
            sub = b - a;
            System.out.println("b - a = " + sub);
        }
        double div = (double) a / (double) b;
        System.out.println("a / b = " + div);
        div = (double) b / (double) a;
        System.out.println("b / a = " + div);
        Integer mul = a * b;
        System.out.println("a * b = " + mul);
    }
    public void task2 () {
        System.out.println("Задание 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String string1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String string2 = scanner.nextLine();
        if (string1.equals(string2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
    public void task3 () {
        System.out.println("Задание 3");
        System.out.println("Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
        Integer[] Array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("четные числа массива:");
        for (Integer n : Array) {
            int remainder = n % 2;
            if (remainder == 0) {
                System.out.println(n);
            }
        }
    }
}