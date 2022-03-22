package Lecture_Netology.КоллекцииList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Первый");
        list.add("Второй");

        printWithIterator(list);
    }

    public static void printWithIterator(List<String> listStorage) {
        System.out.println("Итератор");
        Iterator<String> itr = listStorage.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
public  static void demoList(){   //аналогия двумерного массива на листах
        List<List<Iterator>> list = new ArrayList<>();
        for(int i =0; i<10;i++){
        list.add(new ArrayList<>());
    }
}

}
