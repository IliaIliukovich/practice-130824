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
        return new Box(this.cat);
    }

    public Box makeDeepCopy() {
        Cat newCat = new Cat(this.cat.getName(), this.cat.getAge());
        return new Box(newCat);
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

        Box newBox = box2.makeShallowCopy();
        System.out.println(box2.equals(newBox));
        System.out.println(box2.cat == newBox.cat);

        Box newDeepBoxCopy = box2.makeDeepCopy();
        System.out.println(box2.equals(newDeepBoxCopy));
        System.out.println(box2.cat == newDeepBoxCopy.cat);
    }
}
