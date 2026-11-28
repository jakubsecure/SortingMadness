package pl.put.poznan.sorting.logic.Algorithms;

import java.util.Comparator;

public class HeapSort<T> implements SortInterface<T> {
    public void sort(T[] data, Comparator<? super T> comparator) {
        int n = data.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(data, n, i, comparator);
        }

        for (int end = n - 1; end > 0; end--) {
            swap(data, 0, end);
            heapify(data, end, 0, comparator);
        }
    }

    private void heapify(T[] data, int n, int i, Comparator<? super T> comparator) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && comparator.compare(data[left], data[largest]) > 0) {
            largest = left;
        }
        if (right < n && comparator.compare(data[right], data[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            swap(data, i, largest);
            heapify(data, n, largest, comparator);
        }
    }

    private void swap(T[] data, int i, int j) {
        T tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}
