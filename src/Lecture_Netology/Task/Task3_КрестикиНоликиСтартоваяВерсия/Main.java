package Lecture_Netology.Task.Task3_КрестикиНоликиСтартоваяВерсия;

import java.util.Scanner;

public class Main {
    public static final int SIZE = 3;
    public static final char CROSS = 'X';
    public static final char ZERO = '0';
    public static final char EMPTY = '-';

    public static void main(String[] args) {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }

        Scanner scanner = new Scanner(System.in);

        boolean isCrossTurn = true;

        while (true) {
            printField(field);
            System.out.println("Введите координаты " + (isCrossTurn ? "крестиков" : "ноликов"));
            String userValue = scanner.nextLine();
            String[] line = userValue.split(" ");
            int r = Integer.parseInt(line[0]) - 1;
            int c = Integer.parseInt(line[1]) - 1;

            if(field[r][c] == CROSS || field[r][c] == ZERO) {
                System.out.println("Ходи заново");
                continue;
            }

            field[r][c] = isCrossTurn ? CROSS : ZERO;
            if (isWin(field, isCrossTurn ? CROSS : ZERO)) {
                System.out.println("Победили " + (isCrossTurn ? "крестики" : "нолики"));
                printField(field);
                String colorRed = (char) 27 + "[31m";
                System.out.println(colorRed + "Стоп игра");
                break;
            }else {
                isCrossTurn =! isCrossTurn;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static boolean isWin(char[][] field, char player) {
        if (field[0][0] == player && field[0][1] == player && field[0][2] == player)
            return true;
        if (field[1][0] == player && field[1][1] == player && field[1][2] == player)
            return true;
        if (field[2][0] == player && field[2][1] == player && field[2][2] == player)
            return true;

        if (field[0][0] == player && field[1][0] == player && field[2][0] == player)
            return true;
        if (field[0][1] == player && field[1][1] == player && field[2][1] == player)
            return true;
        if (field[0][2] == player && field[1][2] == player && field[2][2] == player)
            return true;

        if (field[0][0] == player && field[1][1] == player && field[2][2] == player)
            return true;
        if (field[1][0] == player && field[1][1] == player && field[0][2] == player)
            return true;
        return false;
    }
}
