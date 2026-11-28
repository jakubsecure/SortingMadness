package pl.put.poznan.sorting.logic.Algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort<T> implements SortInterface<T> {
    public void sort(T[] data, Comparator<? super T> comparator) {
        if (data.length < 2) {
            return;
        }

        T[] aux = Arrays.copyOf(data, data.length);
        mergeSort(data, aux, 0, data.length - 1, comparator);
    }

    private void mergeSort(T[] data, T[] aux, int left, int right, Comparator<? super T> comparator) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(data, aux, left, mid, comparator);
        mergeSort(data, aux, mid + 1, right, comparator);
        merge(data, aux, left, mid, right, comparator);
    }

    private void merge(T[] data, T[] aux, int left, int mid, int right, Comparator<? super T> comparator) {

        for (int i = left; i <= right; i++) {
            aux[i] = data[i];
        }

        int i = left;
        int j = mid + 1;

        for (int k = left; k <= right; k++) {
            if (i > mid) {
                data[k] = aux[j++];
            } else if (j > right) {
                data[k] = aux[i++];
            } else if (comparator.compare(aux[j], aux[i]) < 0) {
                data[k] = aux[j++];
            } else {
                data[k] = aux[i++];
            }
        }
    }
}
