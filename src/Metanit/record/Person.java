package Metanit.record;

public record Person(String name, int age) {
    Person (String firstName, String lastName, int age) {
        this (firstName + " " + lastName, age);

    }
    // переопределение метода
    public String name() {
        return "mr. " + name;
    }

}
