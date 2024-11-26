package lesson20241126;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomArrayList implements Iterable<String>{

    private String[] data;

    public CustomArrayList(String[] data) {
        this.data = data;
    }


    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String> {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < data.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            return data[currentIndex++];
        }
    }
}
