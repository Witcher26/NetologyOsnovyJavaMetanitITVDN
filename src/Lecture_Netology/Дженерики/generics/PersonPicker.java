package Lecture_Netology.Дженерики.generics;

import Lecture_Netology.Дженерики.generics.Person;

public class PersonPicker<T extends Person> {  // сюда можно подставить тип только Person или его наследников
    private double firstProb;

    public PersonPicker(double firstProb) {
        this.firstProb = firstProb;
    }

    public T pick(T p1, T p2) {
        if (p1.getName().length() > p1.getName().length()) {
            return p1;
        } else if (p2.getName().length() > p1.getName().length()) {
            return p2;
        } else {
            if (Math.random() <= firstProb)  // методика случайного выбора с фиксированной вероятностью выбора
                return p1;
            else
                return p2;
        }
    }
}
