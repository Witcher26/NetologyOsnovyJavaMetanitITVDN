package Lecture_ITVDN.Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //Создаём объект класса файл и указываем файл.
        File f = new File("C:\\Pr\\3_Third_Projects\\src\\Lecture_ITVDN\\file.txt");
        Car c = new Car(50000, "Запорожец");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f)); //необходимо обработать исключение т.к.ObjectOutputStream
            // при вызове метода  writeObject вызывает исключительную ситуацию
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) { // считывание файла
            oos.writeObject(c); // серилиализация

            //Десериализуем объект Car c байт-кода
            Car car =(Car)ois.readObject(); // десериализация
            System.out.println(car);
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
