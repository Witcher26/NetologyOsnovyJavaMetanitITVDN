package Lecture_ITVDN.Cloning.serializationWithObj;

import java.io.Serializable;

public class Engine implements Serializable {
    private int power;

    public Engine() { }
    Engine(int power) {this.power=power;}

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                '}';
    }
    public  int getPower(){return power;};

    public void setPower(int power) { this.power = power; }


}
