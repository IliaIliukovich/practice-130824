package lesson20241031;

public class Cat extends Animal {

    public Cat(String name, String colour, int age, boolean isHungry) {
        super(name, colour, age, isHungry);
    }

    public Cat(String name) {
        super(name, "white", 1, true);
    }

    public void sayHello() {
        meow();
        System.out.println("Hello! I'm cat. My name is " + getName());
    }

    public void meow() {
        System.out.println("Meow!");
    }

}
