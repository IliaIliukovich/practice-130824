package lesson20241210;

import java.util.*;

public class TopKTask {

    public static void main(String[] args) {
    // Дан список из n товаров. У каждого товара есть название и цена.
    // Написать метод для получения списка топ-k самых дешевых товаров, где k - входной параметр.
        List<Item> items = List.of(new Item("book", 12), new Item("snickers", 23),
                new Item("newspaper", 4), new Item("journal", 23),
                new Item("stick", 2), new Item("cup", 25));

        List<Item> topItems = findTopKBySort(items, 3); //  O (n * log n)
        System.out.println(topItems);

        topItems = findTopKByPriorityQueue(items, 3); //  O (n * log n)
        System.out.println(topItems);

        topItems = findTopKByPriorityQueueOptimized(items, 3); //  O (n * log k)
        System.out.println(topItems);

    }

    public static List<Item> findTopKBySort(List<Item> items, int k) { // O(n * log n)  // k = 1,2 ----> O(n)
        List<Item> copy = new ArrayList<>(items); // O(n)
        Collections.sort(copy); // O(n * log n)
        List<Item> result = new ArrayList<>();
        for (int i = 0; i < k; i++) { // O(K)
            result.add(copy.get(i));
        }
        return result;
    }

    public static List<Item> findTopKByPriorityQueue(List<Item> items, int k) {  // O (n * log n)
        Queue<Item> queue = new PriorityQueue<>(items); // O (n * log n)
        List<Item> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(queue.remove());
        }
        return result;
    }

    public static List<Item> findTopKByPriorityQueueOptimized(List<Item> items, int k) {  //  O (n * log k)
       Queue<Item> queue = new PriorityQueue<>(Comparator.reverseOrder()); // O(k * log k)
        Iterator<Item> iterator = items.iterator();
        for (int i = 0; i < k; i++) { // O (n * log k)
            queue.add(iterator.next());
        }

        for (int i = 0; i < items.size() - k; i++) {
            Item element = iterator.next();
            if (queue.peek().getPrice() > element.getPrice()) {
                queue.remove();
                queue.add(element);
            }
        }

        List<Item> result = new ArrayList<>(queue); // O(k)
        Collections.sort(result); // (k * log k)
        return result;
    }


    static class Item implements Comparable<Item> {
        private String name;
        private int price;

        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public int compareTo(Item o) {
            return this.price - o.price;
        }
    }


}
