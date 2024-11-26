package lesson20241126;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TaskSolutions {

    public static void main(String[] args) {
        // 1. Перебрать LinkedList<String> и найти самую короткую строку.
        List<String> list = new LinkedList<>(List.of("A", "B", "Two", "Three", "Hello!"));

        // 2. Перебрать LinkedList<String> и объединить все строки в одну с использованием разделителя "|".
        StringBuilder result = new StringBuilder(list.get(0));
//        for (int i = 0; i < list.size(); i++) { // O(n^2)
//            result.append("|").append(list.get(i));
//        }
        for (String s : list) { // O(n)
            result.append("|").append(s);
        }
        String string = result.toString();
        System.out.println(string);

        // 3. Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
        Box box1 = new Box("apple", 10, true);
        Box box2 = new Box("orange", 70, false);
        Box box3 = new Box("ananas", 10, true);
        Box box4 = new Box("potato", 5, false);
        Box box5 = new Box("lemon", 7, true);
        List<Box> items = new LinkedList<>(List.of(box1, box2, box3, box4, box5));

        Iterator<Box> iterator = items.iterator();
        while (iterator.hasNext()) {
            Box current = iterator.next();
            if (!current.isInStock()) {
                iterator.remove();
            }
        }
        System.out.println(items);
    }


}
