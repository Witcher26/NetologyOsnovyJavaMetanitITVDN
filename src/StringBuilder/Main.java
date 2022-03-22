package StringBuilder;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int day = 6;
        System.out.println(isDayOff(6)? "Выходной ": "Не выходной");
    }

    public  static  boolean isDayOff(int day) {
//        if(day==6|| day==7) {
//            return true;
//        }
//        else {
//            return false;
//        }

        //аналогично

        return day==6|| day==7;

    }
}
