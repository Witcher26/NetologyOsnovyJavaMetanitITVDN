package Lecture_ITVDN.Cloning.serializationWithObj;
import java.io.Serializable;

public class Car implements Serializable {
    private int price;
    private String model;
    private Engine engine;

    Car(int price, String model, Engine engine) {
        this.price = price;
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price; }

    public String getModel() {return model; }

    public void setModel(String model) {this.model = model;  }

    public Engine getEngine() { return engine; }

    public void setEngine(Engine engine) { this.engine = engine;}


}
