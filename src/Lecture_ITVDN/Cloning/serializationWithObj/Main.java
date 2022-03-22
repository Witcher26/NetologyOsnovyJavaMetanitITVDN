package Lecture_ITVDN.Cloning.serializationWithObj;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Pr\\3_Third_Projects\\src\\ITVDN_Lecture.Cloning.serializationWithObj\\file3.txt");
        Car c = new Car(5000, "Запорожец", new Engine(1500));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){

            oos.writeObject(c); // сериализация.
            //десериализация

            Car newCar = (Car) ois.readObject();
            System.out.println(newCar);

        } catch (IOException  | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
