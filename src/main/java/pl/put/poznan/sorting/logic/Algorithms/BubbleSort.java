package Algorithms;

import java.util.Comparator;

public class BubbleSort<T> implements SortInterface<T> {
    public void sort(T[] data, Comparator<? super T> cmp) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (cmp.compare(data[j], data[j + 1]) > 0) {
                    T tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }
}
