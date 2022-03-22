package Lecture_Netology.Исключения.ВыбросСвоихИсключений;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            try {
                String passportValue = getContentFromFile("C:\\Pr\\3_Third_Projects\\src\\Lecture_Netology\\Исключения\\pass2.txt");
                System.out.println(passportValue);
            } catch (IOException err) {
                throw new DocumentNotFountException("паспорт");
            }

            try {
                String svidetelsvoValue = getContentFromFile("C:\\Pr\\3_Third_Projects\\src\\Lecture_Netology\\Исключения\\pass3.txt");
                System.out.println(svidetelsvoValue);
            } catch (IOException er) {
                System.out.println();
            }
        } finally {
            System.out.println("Завершение программы");
        }
        System.out.println(getNumber());
    }


    private static String getContentFromFile(String filename) throws IOException {

        FileInputStream fis = new FileInputStream(filename);
        BufferedReader fileReader = new BufferedReader(
                new InputStreamReader(fis));
        return fileReader.readLine();
    }

    private static int getNumber() {
        try {
            throw new RuntimeException();
            //return 0; // до этой строки компилятор не дойдет: uncreachable statement
        } catch (RuntimeException err) {
            throw new RuntimeException();
        } finally {
             return 2; // вернется значение блока finally
        }
    }
}
