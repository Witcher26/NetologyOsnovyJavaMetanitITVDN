package Home_Task_Netology.Seven.Korsina;

import java.util.Scanner;
/*
писание
Вы пишете программу, планирующую продуктовую корзину.
У вас есть список доступных продуктов в одном массиве и соответствующая им цена в другом массиве.
Пользователь вводит номер продукта из первого списка и количество продуктов этого вида, которое хочет купить.
Программа добавляет указанное количество выбранного продукта в итоговую сумму продуктовой корзины.
Действие повторяется до тех пор, пока пользователь не введет команду "end".
Только после этого выводится вся корзина выбранных товаров и итоговая сумма.

Функционал программы
Создание массива продуктов внутри программы (без пользовательского ввода);
Создание массива цен на продукты (без пользовательского ввода);
Вывод списка доступных для покупки продуктов на экран;
Возможность ввода пользователем одной строкой номера продукта и количества для добавления в корзину;
Пользователь может добавлять несколько раз один и тот же товар в корзину, в этом случае он должен суммироваться);
Вывод всех покупок, их общую стоимость и количество на экран.
 */
public class Main {
    private static String[] products = {"Молоко", "Хлеб", "Вода", "Соль", "Лобстер"};
    private static int[] prices = {83, 46, 16, 7, 4500};
    private static int[] userBin = new int[5];
    private static int sumProducts = 0;

    public static void printResult() {
        for (int i = 0; i < userBin.length; i++) {
            if (userBin[i] != 0) {
                System.out.println();
                System.out.print(products[i] + "\t\t\t" + userBin[i] + "\t\t\t" + prices[i] + "\t\t\t" + (userBin[i] * prices[i]));
            }
        }
        System.out.println();
        String colorPurple = (char) 27 + "[35m";
        System.out.println(colorPurple + "\t\t\t\t\t\t\tИтого: \t\t" + sumProducts);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String colorRed = (char) 27 + "[31m";
        String colorGreen = (char) 27 + "[32m";


        System.out.println("Список товаров:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " - " + prices[i] + " руб./шт.");
        }

        while (true) {
            System.out.println("Выберите товар и количество или введите \"end\" для выхода");
            String userValue = scanner.nextLine();
            if (userValue.equals("end")) {
                if (sumProducts == 0) {
                    System.out.println(colorRed + "Вы вышли из программы");
                    break;
                }
                System.out.println(colorGreen + "Ваша корзина: ");
                System.out.print("Наименование \tКоличество \tЦена/ед. \tОбщая стоимость");
                printResult();
                break;
            }

            String[] value = userValue.split(" ");
            int number = Integer.parseInt(value[0]) - 1;
            int count = Integer.parseInt(value[1]);
            userBin[number] += count;
            sumProducts += prices[number] * count;
        }
    }
}

