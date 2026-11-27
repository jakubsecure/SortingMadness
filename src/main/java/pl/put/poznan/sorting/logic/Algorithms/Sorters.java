package Algorithms;

import java.util.Comparator;

public enum Sorters {
    BUBBLE    { public <T> void sort(T[] d, Comparator<? super T> c) { new BubbleSort<T>().sort(d, c); } },
    INSERTION { public <T> void sort(T[] d, Comparator<? super T> c) { new InsertionSort<T>().sort(d, c); } },
    SELECTION { public <T> void sort(T[] d, Comparator<? super T> c) { new SelectionSort<T>().sort(d, c); } },
    MERGE     { public <T> void sort(T[] d, Comparator<? super T> c) { new MergeSort<T>().sort(d, c); } },
    QUICK     { public <T> void sort(T[] d, Comparator<? super T> c) { new QuickSort<T>().sort(d, c); } },
    HEAP      { public <T> void sort(T[] d, Comparator<? super T> c) { new HeapSort<T>().sort(d, c); } },
    BOGO      { public <T> void sort(T[] d, Comparator<? super T> c) { new BogoSort<T>().sort(d, c); } };

    public abstract <T> void sort(T[] data, Comparator<? super T> comparator);
}