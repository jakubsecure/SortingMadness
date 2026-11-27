package Algorithms;

import java.util.Comparator;

public class SelectionSort<T> implements SortInterface<T> {
    public void sort(T[] data, Comparator<? super T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < data.length; j++) {
                if (comparator.compare(data[j], data[min]) < 0) {
                    min = j;
                }
            }

            if (min != i) {
                swap(data, i, min);
            }
        }
    }

    private void swap(T[] data, int i, int j) {
        T tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}