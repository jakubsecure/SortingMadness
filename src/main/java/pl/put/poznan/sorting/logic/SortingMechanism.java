package pl.put.poznan.sorting.logic;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class SortingMechanism {

    private String order;

    private long numbers[];

    private long objects[][];

    public SortingMechanism(long[] nbs, String ord){
        this.numbers = nbs;
        this.order = ord;
    }

    public SortingMechanism(long[][] objs, String ord) {
        this.objects = objs;
        this.order = ord;

    }

    public void sort(String text){
        switch (text) {
            case "bubble":
                // do the sorting 
                break;
            default:
                throw new IllegalArgumentException("Unsupported sorting algorithm: " + text);
        }
    }

    public long[] getNumbers(){
        return this.numbers;
    }

    public long[][] getObjects(){
        return this.objects;
    }
}
