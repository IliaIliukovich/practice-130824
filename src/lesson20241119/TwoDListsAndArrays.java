package lesson20241119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDListsAndArrays {

    public static void main(String[] args) {
        int[][] ints = new int[2][3];
        ints[0][0] = 1;
        ints[0][1] = 2;
        ints[0][2] = 3;
        ints[1][0] = 4;
        ints[1][1] = 5;
        ints[1][2] = 6;
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.deepToString(ints));

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println(ints[i][j]);
            }
        }

        List<List<String>> listOfLists = new ArrayList<>();
        List<String> list1 = List.of("A", "B", "C");
        List<String> list2 = List.of("D", "E", "F");
        List<String> list3 = List.of("G", "H");
        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);
        System.out.println(listOfLists);

//        System.out.println(listOfLists.get(1).get(2));

        for (int i = 0; i < listOfLists.size(); i++) {
            for (int j = 0; j < listOfLists.get(i).size(); j++) {
                System.out.println(listOfLists.get(i).get(j));
            }
        }


    }


}
