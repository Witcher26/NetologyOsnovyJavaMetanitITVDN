package Home_Task_ITVDN.cloning;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        Bird bird = new Bird(1, "Говорун","red");

        ByteArrayOutputStream byteOutput;
        ByteArrayInputStream byteInput;

        ObjectOutputStream output;
        ObjectInputStream input;

        try {
            byteOutput = new ByteArrayOutputStream();
            output = new ObjectOutputStream(byteOutput);

            output.writeObject(bird);

            byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
            input = new ObjectInputStream(byteInput);

            Bird cloniedBird = (Bird) input.readObject();
            System.out.println("До");
            System.out.println(bird);
            System.out.println(cloniedBird);

            System.out.println("После");
            cloniedBird.setName("Не Бурёнка");
            System.out.println(cloniedBird);
            cloniedBird.setId(25);
            System.out.println(cloniedBird);
            System.out.println("===========================");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Eagle eagle = new Eagle(1,"Арёл",true,2);
        System.out.println(eagle);

        Eagle cloniedEagle = (Eagle) eagle.clone();
        System.out.println("===========================");
        System.out.println("До клонирования орла");
        System.out.println(eagle);
        System.out.println(cloniedEagle);

        cloniedEagle.id=69;
        cloniedEagle.name="Орёл";
        System.out.println("===========================");
        System.out.println("После клонирования орла");
        System.out.println(eagle);
        System.out.println(cloniedEagle);

        ArrayList list = new ArrayList();


    }
}
