package Lecture_Netology.Дженерики.generics;

public class Doctor extends Person {
    private int saved;

    public Doctor(String name, int age) {
        super(name, age);
    }

    public void oneMoreLife() {
        saved++;
    }
}
