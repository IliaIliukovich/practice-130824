package lesson20241126;

public class Box {

    private String data;
    private int count;
    private boolean isInStock;

    public Box(String data, int count, boolean isInStock) {
        this.data = data;
        this.count = count;
        this.isInStock = isInStock;
    }

    public String getData() {
        return data;
    }

    public int getCount() {
        return count;
    }

    public boolean isInStock() {
        return isInStock;
    }

    @Override
    public String toString() {
        return "Box{" +
                "data='" + data + '\'' +
                ", count=" + count +
                ", isInStock=" + isInStock +
                '}';
    }
}
