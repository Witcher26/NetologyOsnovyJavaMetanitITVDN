package Home_Task_ITVDN.cloning;

public class Eagle extends Animal {
    public int wing;

    public Eagle(int wing) {
        this.wing = wing;
    }

    public Eagle(int id, String name, boolean male, int wing) {
        super(id, name, male);
        this.wing = wing;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", male=" + male +
                ", wing=" + wing +
                '}';
    }

//    @Override
//    public Animal clone() throws CloneNotSupportedException {
//         super.clone();
//         Eagle eagle = (Eagle) super.clone();
//         return eagle;
//    }
}
