package Lecture_Netology.Дженерики.generics;

public class Main {
    public static void main(String[] args) {
        Singer petya = new Singer("Petya", 8, 3);
        Singer anya = new Singer("Anya", 15,5);

        PersonPicker<Singer> picker = new PersonPicker<> (0.3);  // в
        Singer pecked = picker.pick(petya, anya); //Чтобы обойти проблему возвращения типов, можно использовать
                                                    //  приведение типов
        System.out.println(pecked.getName());

        pecked = (Singer) picker.pick(petya, anya);
        System.out.println(pecked.getName());

        pecked = (Singer) picker.pick(petya, anya);
        System.out.println(pecked.getName());

        Person p = pick(0.4, petya, anya);
        System.out.println(p);
    }

    public  static <T> T pick(double prob, T p1, T p2){
        if (Math.random() <= prob)  // методика случайного выбора с фиксированной вероятностью выбора
            return p1;
        else
            return p2;
    }
}
