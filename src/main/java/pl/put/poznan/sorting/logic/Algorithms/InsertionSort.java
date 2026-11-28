package pl.put.poznan.sorting.logic.Algorithms;

import java.util.Comparator;

public class InsertionSort<T> implements SortInterface<T> {
    public void sort(T[] data, Comparator<? super T> comparator) {
        for (int i = 1; i < data.length; i++) {
            T key = data[i];
            int j = i - 1;

            while (j >= 0 && comparator.compare(data[j], key) > 0) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key;
        }
    }
}
