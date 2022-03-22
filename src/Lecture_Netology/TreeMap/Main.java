package Lecture_Netology.TreeMap;

import Lecture_Netology.HashSetиHashMap.*;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Go");
        Map<DriverLicense, Man> storage = new TreeMap<>(
                new DriverLicenseComparatorByFio()
        );


        // fillStorage2(storage);


//    public static void fillStorage2(Map<DriverLicense, Man> storage) {
//        storage.put(new DriverLicense("1", "Иванов Иван Иванович", "AB"), new Man("Иванов"));
//        storage.put(new DriverLicense("2", "Петров Пётр Петрович", "AB"), new Man("Петров"));
//    }
    }
}


