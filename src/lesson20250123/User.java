package lesson20250123;

import java.util.Objects;

public class User implements Cloneable{

    private String name;
    private String surname;
    private int age;
    private Address address;

    public User(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof User user)) return false;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address city = new Address("NY city");
        User user = new User("Tom", "Smiths", 43, city);
//        User copy = user;
//        User copy = new User(user.getName(), user.getSurname(), user.getAge());
        User copy = (User) user.clone();
        System.out.println(copy);

        System.out.println(user == copy);
        System.out.println(user.equals(copy));

        System.out.println(city == copy.getAddress());
        System.out.println(city.equals(copy.getAddress()));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        User cloned = (User) super.clone();
        Address clonedAddress = (Address) address.clone();
        cloned.setAddress(clonedAddress);
        return cloned;
    }




}
