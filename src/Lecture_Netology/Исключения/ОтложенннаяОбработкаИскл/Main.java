package Lecture_Netology.Исключения.ОтложенннаяОбработкаИскл;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            String passportValue = getContentFromFile("C:\\Pr\\3_Third_Projects\\src\\Lecture_Netology\\Исключения\\pass2.txt");
            System.out.println(passportValue);
        } catch (IOException err) {
            System.out.println("Паспорт обязателен");

            try {
                String svidetelsvoValue = getContentFromFile("C:\\Pr\\3_Third_Projects\\src\\Lecture_Netology\\Исключения\\pass3.txt");
                System.out.println(svidetelsvoValue);
            } catch (IOException er) {
                System.out.println();
            }
        }
    }

    private static String getContentFromFile(String filename) throws IOException {
        //try {
        FileInputStream fis = new FileInputStream(filename);
        BufferedReader fileReader = new BufferedReader(
                new InputStreamReader(fis));

        return fileReader.readLine();
//        } catch (FileNotFoundException err) {
//            return "Ошибка чтения файла. Файл не найден";
//        } catch (IOException err) {
//            return "Ошибка ввода-вывода";
//        }
    }
}