package Lecture_Netology.Task.Task1;
import static java.lang.System.*;


import java.util.Scanner;

public class Task1 {

    public static Scanner scanner = new Scanner(in);
    private static String colorRed = (char) 27 + "[31m";

    private static int [] days = new int[30];
    private static boolean[] filledDay = new boolean[30];
    public static int count=0;
    public static double sum =0;

    public static void printMenu() {
        String colorGreen = (char) 27 + "[32m";
        out.println(colorGreen + "Введите два числа через пробел: день температура (без запятой, без ковычек) или слово \"end\" для выхода из программы.");
    }

    public static void calculateSum() {
        for(int t : days){
            sum+=t;
        }
    }

    public static void main(String[] args) {
        while (true) {
        printMenu();
        String userValue = scanner.nextLine();
        if(userValue.equals("end")) {
            out.println(colorRed + "Вы вышли из программы");
            break;
        }

        String [] massiveValue = userValue.split(" ");
        int numberOfDay = Integer.parseInt(massiveValue[0])-1;
        int temp = Integer.parseInt(massiveValue[1]);
        days[numberOfDay] = temp;
        filledDay[numberOfDay]=true;

        calculateSum();

        for (boolean isFilled : filledDay){
            if(isFilled){
                count++;
            }
        }

        out.printf("Средняя температура равна: %.1f\n", (sum / count));
        out.println();

        }
    }
}
