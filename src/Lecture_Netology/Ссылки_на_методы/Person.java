package Lecture_Netology.Ссылки_на_методы;

public class Person {
    private String fio;
    private int age;
    private String lastName;

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String fio, int age, String lastName) {
        this.fio = fio;
        this.age = age;
        this.lastName = lastName;
    }
}
