package StringBuilder;

public class Вывод_Процента_прогресса {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        System.out.println(sb.toString());

        //Вывод прогресса
        String text = sb.toString();
        final  int N = 1_000_000;

        System.out.println("Start");
        //StringBuilder sbb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (i % (N/100)==0) System.out.println((i / (N / 100))+ "%...");
            text= text+ '!';

          //  sbb.append('!');

        }
       // String s = sb.toString();
        System.out.println("Finish");
        System.out.println("Generated string with " + text.length() + " length");
        //System.out.println("Generated string with " + s.length() + " length");
    }

}
