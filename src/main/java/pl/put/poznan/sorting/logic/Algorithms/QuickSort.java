package pl.put.poznan.sorting.logic.Algorithms;

import java.util.Comparator;

public class QuickSort<T> implements SortInterface<T> {
    public void sort(T[] data, Comparator<? super T> comparator) {
        quickSort(data, 0, data.length - 1, comparator);
    }

    private void quickSort(T[] data, int low, int high, Comparator<? super T> comparator) {
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(data, low, high, comparator);

        quickSort(data, low, pivotIndex - 1, comparator);
        quickSort(data, pivotIndex + 1, high, comparator);
    }

    private int partition(T[] data, int low, int high, Comparator<? super T> comparator) {

        T pivot = data[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(data[j], pivot) <= 0) {
                i++;
                swap(data, i, j);
            }
        }

        swap(data, i + 1, high);
        return i + 1;
    }

    private void swap(T[] data, int i, int j) {
        T tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}