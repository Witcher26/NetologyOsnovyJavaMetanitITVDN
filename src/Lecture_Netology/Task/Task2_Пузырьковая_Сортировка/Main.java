package Lecture_Netology.Task.Task2_Пузырьковая_Сортировка;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        float prices [] = new float[10];
        float tempPrice;
        for (int i = 0; i < prices.length; i++) {
            prices[i] = new Random().nextInt(11); // случайные значения от 0 до 10;
        }

        // сам метод пузырьковой сортировки
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if(prices[j] > prices[j+1])
                {
                    tempPrice = prices[j];
                    prices[j] = prices[j+1];
                    prices[j+1] = tempPrice;
                }
            }
        }
        for (int j = 0; j < prices.length; j++) {
            System.out.println(prices[j]);
        }
    }
}
