package lesson20241121;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
//        List<String> list = List.of("A", "B", "C");
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Iterator<String> iterator = list.iterator();

        for (String s : list) {
            System.out.println(s);
//            list.remove("B");
        }

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
//            list.remove("B");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}
