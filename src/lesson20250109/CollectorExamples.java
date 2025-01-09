package lesson20250109;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorExamples {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        LinkedList<Integer> result = integers.stream().collect(Collectors.toCollection(() -> new LinkedList<>()));
        result = integers.stream().collect(Collectors.toCollection(LinkedList::new));
    }


}
