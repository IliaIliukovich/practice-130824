package lesson20241031;

import lesson20241031.creatures.Cat;
import lesson20241031.creatures.Dog;
import lesson20241031.creatures.Human;
import lesson20241031.creatures.Robot;

public class House {

    public static void main(String[] args) {

        // Part 1
        Cat tom = new Cat("Tom");
        tom.sayHello();
        tom.feed();
        System.out.println(tom);

        Robot robot1 = new Robot("Vacuum cleaner", "Robot to clean the house");
        robot1.printCurrentRobotInfo();
        Robot robot2 = new Robot("Washing machine", "Robot to wash something");
        robot2.printCurrentRobotInfo();
        Robot.printTotalRobotCount();

        Human human = new Human("Mark");
        human.feedAnimal(tom);

        // Part 2
        Dog dog = new Dog("Bobby", "grey", 3, false);
        dog.sayHello();
        human.walk(dog);
        System.out.println(dog);
        human.feedAnimal(dog);

        // Part 3
        human.play(robot1);
        tom.play(dog);
        dog.play(tom);

        robot1.walk(dog);
        robot1.catchMouse();
    }


}
