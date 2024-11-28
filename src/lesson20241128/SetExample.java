package lesson20241128;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Data data1 = new Data(1, "A");
        Data data2 = new Data(1, "A");
        Data data3 = new Data(3, "C");

//        Set<Data> set1 = new TreeSet<>();
//        set1.add(data1);
//        set1.add(data2);
//        set1.add(data3);

        Set<Data> set2 = new HashSet<>();
        set2.add(data1);
        set2.add(data2);
        set2.add(data3);
        System.out.println(set2);

        Set<String> stringSet = Set.of("A", "B", "C");

    }

    static class Data {
        private int intData;
        private String stringData;

        public Data(int intData, String stringData) {
            this.intData = intData;
            this.stringData = stringData;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "intData=" + intData +
                    ", stringData='" + stringData + '\'' +
                    '}';
        }
    }



}
