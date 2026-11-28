package pl.put.poznan.sorting.logic.Algorithms;
import java.util.Comparator;


public interface SortInterface<T> {
    void sort(T[] data, Comparator<? super T> comparator);
}