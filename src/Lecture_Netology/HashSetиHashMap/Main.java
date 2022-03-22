package Lecture_Netology.HashSetиHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, DriverLicense> storage = new HashMap<>();

        fillStorage(storage);

        System.out.println(storage.get("2"));
        System.out.println(storage.get("12358"));
        System.out.println(storage.get("123583"));

        //Вывод карты на экран. Циклом нельзя, посредством представления коллекции
        for (Map.Entry<String, DriverLicense> entry : storage.entrySet()) { //entrySet() - и ключ и значение для работы с каждой ассоциацией в отдельности-> отдельно ключ, отдельно значние
            System.out.println(entry.getKey() + " " + entry.getValue());//порядок вывода элементов может быть отличным
        }
        ///////////////////////////////////////////////////

        Days[] d = Days.values();// очень интересно
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }

        System.out.println(Days.values().toString());
        System.out.println(storage.size()); // считает коллизии тоже

        Map<DriverLicense, Man> storage2 = new HashMap<>();
        fillStorage2(storage2);

        final DriverLicense targetLicense = new DriverLicense("1", "Иванов Иван Иванович", "AB");
        System.out.println("Мужик определяется здесь");
        System.out.println(storage2.get(targetLicense));

        System.out.println("Итерировние только по ключю ");

       for(DriverLicense driverLicense : storage2.keySet()) {
           System.out.println(driverLicense);
       }

        System.out.println("Итерировние только по значению ");

        for(Man driverLicense : storage2.values()) {
            System.out.println(driverLicense);
        }



        System.out.println(storage.get("2"));
        System.out.println(storage.get("12358"));
        System.out.println(storage.get("123583"));
////////////////////////////////////////////


    }

    public static void fillStorage(Map<String, DriverLicense> storage) {
        storage.put("1", new DriverLicense("1", "VilkovPyatukh", "AB"));
        storage.put("2", new DriverLicense("2", "Vilkovloshok", "B"));
        storage.put("3", new DriverLicense("3", "VilkovMilkov", "A"));
    }

    public static void fillStorage2(Map<DriverLicense, Man> storage) {
        storage.put(new DriverLicense("1", "Иванов Иван Иванович", "AB"), new Man("Иванов"));
        storage.put(new DriverLicense("2", "Петров Пётр Петрович", "AB"), new Man("Петров"));
    }

}

enum Days {  //набор логически связанных констант
    MONDAYS,
    Thussay
}
