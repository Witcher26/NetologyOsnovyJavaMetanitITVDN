package Metanit.record;

public class Main {


    public static void main(String[] args) {
        Person person33 = new Person("Персон", 50);
        Person person2 = new Person("Not a person33", 69);

        System.out.println(person33.name());
        System.out.println(person33.age());
        System.out.println(person33.toString());

        System.out.println(person33.equals(person2));

        System.out.println(person33.hashCode());

        System.out.println(person33.toString());

        Person person3 = new Person("Имя","Фамилия", 27);
        System.out.println(person3.toString());




    }
}
