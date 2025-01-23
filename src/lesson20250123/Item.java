package lesson20250123;

import java.io.*;
import java.util.Objects;

public class Item implements Serializable{

    private String name;

    private int count;

    private Double price;

    private ItemDetail itemDetail;

    public Item(String name, int count, Double price, ItemDetail itemDetail) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.itemDetail = itemDetail;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", itemDatail=" + itemDetail +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Item item)) return false;
        return count == item.count && Objects.equals(name, item.name) && Objects.equals(price, item.price) && Objects.equals(itemDetail, item.itemDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count, price, itemDetail);
    }

    public ItemDetail getItemDetail() {
        return itemDetail;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ItemDetail itemDetail = new ItemDetail("This is ball for games");
        Item item = new Item("ball", 10, 10.0, itemDetail);

        // serialization
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(out);
        outputStream.writeObject(item);

        byte[] storedData = out.toByteArray();
        for(byte data : storedData) {
            System.out.print((char) data + " ");
        }
        System.out.println();

        // deserialization
        ByteArrayInputStream inputStream = new ByteArrayInputStream(storedData);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Item restoredItem = (Item) objectInputStream.readObject();
        System.out.println(restoredItem);

        System.out.println(item == restoredItem);
        System.out.println(item.equals(restoredItem));
        System.out.println(itemDetail == restoredItem.getItemDetail());
        System.out.println(itemDetail.equals(restoredItem.getItemDetail()));
    }
}
