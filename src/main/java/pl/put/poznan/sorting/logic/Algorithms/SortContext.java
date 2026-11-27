package Algorithms;

import java.util.Comparator;

public class SortContext<T> {
    private SortInterface<T> method;

    public void setMethod(SortInterface<T> method) {
        this.method = method;
    }

    public void performSort(T[] data, Comparator<? super T> comparator) {
        if (method == null) {
            throw new IllegalStateException("Nie wybrano metody sortowania.");
        }
        method.sort(data, comparator);
    }
}
