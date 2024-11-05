package lesson20241031;

public class Human extends Creature {

    public Human(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I'm human. My name is " + getName());
    }

    public void feedAnimal(Animal animal) {
        System.out.println("Human " + getName() + " feeds the animal " + animal.getName());
        animal.feed();
    }
    public void feedAnimal(Animal[] animals){
        for (Animal animal : animals) {
            feedAnimal(animal);
        }
    }

    public void walk(Animal animal) {
        System.out.println("Human " + getName() + " walks with " + animal.getName());
        animal.setHungry(true);
    }
}
