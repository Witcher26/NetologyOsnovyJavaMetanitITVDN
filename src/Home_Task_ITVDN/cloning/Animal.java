package Home_Task_ITVDN.cloning;

public class Animal implements Cloneable{
    public int id;
    public String name;
    public boolean male;

    public Animal() {}

    public Animal(int id, String name, boolean male) {
        this.id = id;
        this.name = name;
        this.male = male;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", male=" + male +
                '}';
    }

    public Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();

//        Animal animal = (Animal) super.clone();
//       return animal;
    }
}
