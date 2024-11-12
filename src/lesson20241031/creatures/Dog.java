package lesson20241031.creatures;

public class Dog extends Animal {

    public Dog(String name, String colour, int age, boolean isHungry) {
        super(name, colour, age, isHungry);
    }

    @Override
    public void sayHello() {
        bark();
        System.out.println("Hello! I'm dog. My name is " + getName());
    }

    public void bark() {
        System.out.println("Gav! Gav!");
    }

    @Override
    public void play(Creature another) {
        if (another instanceof Cat) {
            bark();
        } else {
            super.play(another);
        }
    }
}
