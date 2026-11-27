package Algorithms;

import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class BogoSort<T> implements SortInterface<T> {
    public void sort(T[] data, Comparator<? super T> comparator) {
        while (!isSorted(data, comparator)) {
            shuffle(data);
        }
    }

    private boolean isSorted(T[] data, Comparator<? super T> comparator) {
        for (int i = 1; i < data.length; i++) {
            if (comparator.compare(data[i - 1], data[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    private void shuffle(T[] data) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        for (int i = data.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            T tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }
    }
}