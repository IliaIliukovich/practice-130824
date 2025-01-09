package lesson20250109;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveSteams {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        IntStream.range(0, 10).forEach(System.out::println);

        int sum = IntStream.range(0, 10).sum();

        int[][] ints = new int[2][5];

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = i + j;
            }
        }

        IntStream.range(0, ints.length).forEach(i -> IntStream.range(0, ints[i].length).peek(j -> ints[i][j] = i + j));

        Stream<Integer> boxed = IntStream.range(0, 10).boxed();
        IntStream intStream = boxed.mapToInt(e -> e);
    }



}
