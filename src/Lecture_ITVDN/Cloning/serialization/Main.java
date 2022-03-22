package Lecture_ITVDN.Cloning.serialization;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Cow burenka = new Cow("Бурёнка",200, 5);
        ByteArrayOutputStream byteOutput = null;
        ByteArrayInputStream byteInput=null;

        ObjectOutputStream output=null;
        ObjectInputStream input = null;

        // для работы с массивом byte используем ByteArrayOutputStream
        //Для сериализации и десериализации используем след. класс ObjectOutputStream
        //Также класс Cow должен реализовать класс Serializable
        try{
            byteOutput = new ByteArrayOutputStream();
            output = new ObjectOutputStream(byteOutput);

            output.writeObject(burenka); // сохраняем состояние объекта в поток байтов
            // считываем и записываем

            byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
            input = new ObjectInputStream(byteInput);



            Cow cloneBurenka =(Cow) input.readObject();
            System.out.println("До");
            System.out.println(burenka);
            System.out.println(cloneBurenka);
            System.out.println("После");

            // меняем параметры клонированного объекта
            cloneBurenka.setWeight(666);


            System.out.println(burenka);
            System.out.println(cloneBurenka);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(byteOutput!=null){
                try {
                    byteOutput.flush();
                    byteOutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(byteInput != null) {
                try {
                    byteInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(output != null) {
                try {
                    output.flush();
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
