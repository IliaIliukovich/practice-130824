package lesson20241031;

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

    }


}
