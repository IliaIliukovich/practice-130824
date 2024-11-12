package lesson20241031.creatures;

import lesson20241031.skills.CatchingSkills;

public class Cat extends Animal implements CatchingSkills {

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

    public void play(Creature another) {
        if (another instanceof Dog) {
            System.out.println("Cat " + getName() + " runs away from dog " + another.getName());
        } else {
            super.play(another);
        }
    }

    @Override
    public void catchMouse() {
        System.out.println("Cat " + getName() + " caught a mouse");
    }
}
