package lesson20241031.creatures;

import lesson20241031.skills.CatchingSkills;
import lesson20241031.skills.Walkable;

public class Robot extends Creature implements Walkable, CatchingSkills {

    private String description;
    private int version;
    private static int totalRobotCount = 0;

    private static final int ROBOT_DEFAULT_VERSION = 1;

    public Robot(String name, String description) {
        super(name);
        this.description = description;
        this.version = ROBOT_DEFAULT_VERSION;
        totalRobotCount++;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I'm robot. My name is " + getName());
    }

    public void printCurrentRobotInfo() {
        System.out.println(this);
    }

    public static void printTotalRobotCount() {
        System.out.println("Total robot count: " + totalRobotCount);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + getName() + '\'' +
                ", description='" + description + '\'' +
                ", version=" + version +
                '}';
    }

    @Override
    public void walk(Animal animal) {
        System.out.println(getName() + " walks with " + animal.getName());
        animal.setHungry(true);
    }

    @Override
    public void catchMouse() {
        System.out.println("Robot " + getName() + " caught a mouse");
    }
}
