package lesson20241212;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Figure implements Comparable<Figure>{

    public abstract double getSquare();

    @Override
    public int compareTo(Figure another) {
        return Double.compare(this.getSquare(), another.getSquare());
    }

    public static void main(String[] args) {
        Square square = new Square(1.0);
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        Rectangle rectangle2 = new Rectangle(5.0, 1.0);

        List<Figure> list = new ArrayList<>();
        list.add(square);
        list.add(rectangle);
        list.add(rectangle2);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }

}
