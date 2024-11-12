package lesson20241112;

import java.util.Objects;

public class Cat {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Cat anotherCat = (Cat) obj;
        return Objects.equals(name, anotherCat.name) && age == anotherCat.age;
    }
}
