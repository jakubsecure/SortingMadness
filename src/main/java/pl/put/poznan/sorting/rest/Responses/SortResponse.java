package pl.put.poznan.sorting.rest.Responses;

public class SortResponse {
    private final long[] result;
    private final String algorithm;
    private final String order;

    public SortResponse(long[] result, String algorithm, String order) {
        this.result = result;
        this.algorithm = algorithm;
        this.order = order;
    }

    public long[] getResult() { return result; }
    public String getAlgorithm() { return algorithm; }
    public String getOrder() { return order; }
}
