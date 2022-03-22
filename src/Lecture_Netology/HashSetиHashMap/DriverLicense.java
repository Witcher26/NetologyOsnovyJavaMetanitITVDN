package Lecture_Netology.HashSetиHashMap;

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class DriverLicense implements Comparable<DriverLicense> {
   private final String number;
   private final String fio;
   private final String category;

    public String getNumber() {
        return number;
    }

    public String getFio() {
        return fio;
    }


    public String getCategory() {
        return category;
    }


    @Override
    public String toString(){
        return String.format("%s (%s -> %s)", fio, number, category);
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj==null || !obj.getClass().equals(DriverLicense.class)) return false; // не совпадение по классу

        DriverLicense altLicense = (DriverLicense) obj;

        return this.number.equals(altLicense.number) && this.category.equals(altLicense.category); // эквивалнетность по серийному номеру и по категории
    }


    public int hashCode(){
        return Objects.hash(number,category); //нужно именно так определять hash. Поля в параметрах д.б. final
        //return 32*number.hashCode() + category.hashCode(); //лучший вариант до 6-й джавы
       // return number.hashCode() + category.hashCode(); //плохо тем, что используется малый диапозон хэш-кода от 0 до 150тыш

      //  return new Random().nextInt(); запись рандома
    }

    public DriverLicense(String number, String fio, String category) {
        this.number = number;
        this.fio = fio;
        this.category = category;
    }

    @Override
    public int compareTo(DriverLicense altLicense) {
        return number.compareTo(altLicense.number);
    }
}
