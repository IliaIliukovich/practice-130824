package lesson20241031;

public class Cat {

    private String name;
    private String colour;
    private int age;
    private boolean isHungry;

    public Cat(String name, String colour, int age, boolean isHungry) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.isHungry = isHungry;
    }

    public Cat(String name) {
        this.name = name;
        this.colour = "white";
        this.age = 1;
        this.isHungry = true;
    }

    public void sayHello() {
        System.out.println("Hello! I'm cat. My name is " + name);
    }

    public void feed() {
        isHungry = false;
        System.out.println("Cat " + name + " is not hungry anymore");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                '}';
    }

    public String getName() {
        return name;
    }
}
