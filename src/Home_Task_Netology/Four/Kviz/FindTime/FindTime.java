package Home_Task_Netology.Four.Kviz.FindTime;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FindTime {
    public  static ArrayList extractTime (String task,String phrase) {
        int pos = task.indexOf(phrase);
        pos+=phrase.length();

        ArrayList <String> list = new ArrayList<>();

        String timeStr =task.substring(pos, pos + 6);
        timeStr=timeStr.trim();
        list.add(timeStr);

        return list;
    }

    public  static ArrayList extractTime2 (String task,String phrase) {
        int pos = task.indexOf(phrase, task.indexOf(phrase)+1);
        pos+=phrase.length();

        ArrayList <String> list2 = new ArrayList<>();

        String timeStr =task.substring(pos, pos + 3);
        timeStr=timeStr.trim();
        list2.add(timeStr);

        return list2;
    }

    public  static ArrayList<String> extractTime3 (String task) {
        String regex = "\\d{2}\\:\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(task);

        ArrayList <String> list = new ArrayList<>(5);
        while (matcher.find()){
            list.add(matcher.group());
        }
       return  list;
    }

    public  static String[] extractTime4 (String task) {
        String regex = "\\d{2}\\:\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(task);

        String [] number = new String[10];
        while (matcher.find()){
            for(int i =0; i<number.length;i++){
                number[i]=matcher.group().toString();
            }
            System.out.println(matcher.group().toString());
        }
    return  number;
    }

    public static void main(String[] args) {
        String text = "Буду работать, начну с 17:00. Путь домой с 18:20. С 19:30 ужин. Сон с 20:00";// нужно вывести в массив всё время

        //String startPhrase = "начну с";
       // String startPhrase = "(\d{2}\:\d{2}");
        String EndPhrase = "закончу в";
        //ArrayList time =  extractTime3(text);
        String[] time =  extractTime4(text);
        System.out.println(time);

    }

}
