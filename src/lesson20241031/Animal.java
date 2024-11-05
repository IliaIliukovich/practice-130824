package lesson20241031;

public abstract class Animal extends Creature {

    private String colour;
    private int age;
    private boolean isHungry;

    public Animal(String name, String colour, int age, boolean isHungry) {
        super(name);
        this.colour = colour;
        this.age = age;
        this.isHungry = isHungry;
    }

    public void feed() {
        isHungry = false;
        System.out.println(this.getClass().getSimpleName() + " " + getName() + " is not hungry anymore");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                '}';
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
