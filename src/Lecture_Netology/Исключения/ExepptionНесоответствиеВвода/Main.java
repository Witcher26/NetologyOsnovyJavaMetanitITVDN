package Lecture_Netology.Исключения.ExepptionНесоответствиеВвода;

import java.util.InputMismatchException;
import java.util.Scanner;

//Exception на несоответствие ввода
public class Main {
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int age = -1;
        while (age == -1) {
            try {
                System.out.println("Введите возраст");
                age = scanner.nextInt();
                System.out.println("Ваш возраст " + age);
            } catch (InputMismatchException err) {
                System.out.println("Введите возраст ещё раз");
                scanner.nextLine();
            }
        }
        System.out.println("Возраст " + age);
    }
}

