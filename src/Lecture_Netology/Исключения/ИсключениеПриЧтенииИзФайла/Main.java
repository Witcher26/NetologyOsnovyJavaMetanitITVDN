package Lecture_Netology.Исключения.ИсключениеПриЧтенииИзФайла;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String passportValue = getContentFromFile("C:\\Pr\\3_Third_Projects\\src\\Lecture_Netology\\Исключения\\pass.txt");
        System.out.println(passportValue);

        String svidetelstvoValue = getContentFromFile("svidetelstvo.txt");
        System.out.println(svidetelstvoValue);
    }

    private static String getContentFromFile(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            BufferedReader fileReader = new BufferedReader(
                    new InputStreamReader(fis));

            return fileReader.readLine();
        } catch (FileNotFoundException err) {
            return "Ошибка чтения файла. Файл не найден";
        } catch (IOException err) {
            return "Ошибка ввода-вывода";
        }
    }
}
