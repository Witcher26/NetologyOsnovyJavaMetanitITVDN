package Home_Task_Netology.Four.Kviz.FindTime;

import java.util.ArrayList;

public class Kviz {
    public  static int extractTime (String task,String phrase) {
        int pos = task.indexOf(phrase);
        pos+=phrase.length();
        String timeStr =task.substring(pos, pos + 3);
        timeStr=timeStr.trim();
        int time = Integer.parseInt(timeStr);
        return time;
    }

    public static void main(String[] args) {
        String text = "Буду работать, начну с 17 и закончу в 18. Потом тоже буду работать, начну с 17 уже утра";// пока полностью не работает(((.

        String startPhrase = "начну с";
        int time =  extractTime(text,startPhrase);

        int [] nums = new int[10];
        for (int i = 0; i < 1; i++) {
            nums[i]=time;
        }
        for (int i : nums){

            System.out.print(i + " ");
        }


    }
}
