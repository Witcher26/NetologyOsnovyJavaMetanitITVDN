package Lecture_Netology.Дженерики.generics;

import Lecture_Netology.Дженерики.generics.Person;

public class Singer extends Person {
    private int rating;

    public Singer(String name, int age, int rating) {
        super(name, age);
        this.rating = rating;
    }
}
