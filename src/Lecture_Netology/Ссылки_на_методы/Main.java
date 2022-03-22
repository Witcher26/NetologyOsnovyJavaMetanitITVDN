package Lecture_Netology.Ссылки_на_методы;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>(Comparator.comparing(Person::getLastName).thenComparing(Person::getAge, Comparator.reverseOrder()));
        // сравнние по имени, зачет сравнение по возрасту, обратный порядок, т.е. от большего к меньшему
    }
}
