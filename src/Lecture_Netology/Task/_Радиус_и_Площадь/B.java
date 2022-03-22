package Lecture_Netology.Task._Радиус_и_Площадь;

import java.util.Scanner;
import static java.lang.System.*;

public class B {

    final static double PI =3.14;

    public static double calculateCircleArea(int radius) {
        double result = radius*radius*PI;
        return result;
    }

    public static double calculateCircleLength(int radius) {
        double result = 2*radius*PI;
        return result;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        out.println("Введите радиус окружности в см.");
        int rad = scanner.nextInt();

        out.println("Площадь круга равна: "+calculateCircleArea(rad)+" см.кв.");
        out.println("Длина круга равна: "+calculateCircleLength(rad)+"см.");
    }
}
