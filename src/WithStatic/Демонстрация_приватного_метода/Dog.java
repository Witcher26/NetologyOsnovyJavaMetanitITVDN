package WithStatic.Демонстрация_приватного_метода;

public class Dog {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if("черный".equals(color) || ("белый".equals(color)))
        {
            this.color = color;
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setColor("черный");
        System.out.println(dog.getColor());
        dog.giveFood("Мясо");
    }
    public  void giveFood(String food) {
        switch (food) {
            case "Мясо": {
                foodMove(food);
                break;
            }
        }

    }
    private void foodMove(String food) {
        System.out.println(food + " Переваривается");
    }

}
