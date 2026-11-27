package Algorithms;
import java.util.Comparator;


public interface SortInterface<T> {
    void sort(T[] data, Comparator<? super T> comparator);
}