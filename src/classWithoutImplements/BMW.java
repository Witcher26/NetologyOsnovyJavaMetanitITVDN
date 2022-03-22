package classWithoutImplements;

import java.io.*;

class BMW extends Car implements Serializable {
        private int price;
        private String model;
       // private Engine engine;
       private transient Engine engine;

     BMW(int weight, int price, String model, Engine engine) {
        super(weight);
        this.price = price;
        this.model = model;
        this.engine = engine;
        System.out.println("Child Constructor");
    }

    @Override
    public String toString() {
        return "BMW{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", weight="+getWeight()+
                '}';
    }


    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public Engine getEngine() {return engine;}

    public void setEngine(Engine engine) { this.engine = engine;}

}

abstract class Car  {//implements Serializable  {

    private int weight;
  //________________________

    public Car() { System.out.println("Parent constructor"); }

    Car(int weight) {
        this.weight=weight;
    }
//________________________

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                '}';
    }
    //________________________


    public int getWeight() {return weight;}

}

 class Engine implements Serializable {
    private int power;
    private String producer;

    Engine(int power, String producer){
        this.power=power;
        this.producer=producer;
    }

     @Override
     public String toString() {
         return "Engine{" +
                 "power=" + power +
                 ", producer=" + producer +
                 '}';
     }

     public  int getPower(){return power;};

    public String setProducer() { return producer; }


}

 class Main {
    public static void main(String[] args) {
    File f = new File("C:\\Pr\\3_Third_Projects\\src\\classWithoutImplements\\file1.txt");

    BMW c = new BMW(1000, 5000, "x6", new Engine(1500, "BMW")); // т.к. поле Engine в классе BMW имеет модификатор transient, значение null;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){

            oos.writeObject(c); // сериализуем BMW в byte-код.
            //десериализация

            BMW newBMW = (BMW)ois.readObject();
            System.out.println(newBMW);

        } catch (IOException  | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
