package lesson20241112;

import java.util.Objects;

public class Box {

    private Cat cat;

    public Box(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Box{" +
                "cat=" + cat +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Box anotherBox = (Box) obj;
        return Objects.equals(cat, anotherBox.cat);
    }

    public Box makeShallowCopy() {
        return null;
    }

    public Box makeDeepCopy() {
        return null;
    }


    public static void main(String[] args) {
        Cat cat1 = new Cat("name", 2);
        Cat cat2 = new Cat(new String("name"), 2);
        Box box1 = new Box(cat1);
        Box box2 = new Box(cat2);

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        System.out.println(box1 == box2);
        System.out.println(box1.equals(box2));
    }
}
