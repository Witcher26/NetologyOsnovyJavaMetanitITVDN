package Lecture_ITVDN.Cloning.serialization;

import java.io.Serializable;

public class Cow implements Serializable {
    private String name; //вообще, должны быть публичные поля, типа id и тд. 2 объекта, имеющие равные id, считаются равными.
    private int weight;
    private int age;

    public Cow() {}

    public Cow(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cow { name=" + name + '\'' + ", weight=" + weight + ", age=" + age + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setHead(int age) {
        this.age = age;
    }
}

