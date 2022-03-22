package WithStatic;

import java.io.*;

public class SimpleStatic {
    private static int staticNumber;
    private int nonStaticNumber;

    public SimpleStatic(int nonStaticNumber){
        this.nonStaticNumber=nonStaticNumber;
        staticNumber=nonStaticNumber;
    }

    @Override
    public String toString() {
        return "SimpleStatic{" +
                "nonStaticNumber=" + nonStaticNumber +
                "staticNumber=" + staticNumber+
                '}';
    }
}

class Dispatcher {
    public static void main(String[] args) {
        SimpleStatic s = new SimpleStatic(10);

        File f = new File("C:\\Pr\\3_Third_Projects\\src\\WithStatic\\static.txt");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(f))){

            objectOutputStream.writeObject(s);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
