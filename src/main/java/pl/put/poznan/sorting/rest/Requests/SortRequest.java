package pl.put.poznan.sorting.rest.Requests;

public class SortRequest {
    private long[] data;
    private String algorithm = "bubble";
    private String order = "asc";

    public long[] getData() { return data; }
    public void setData(long[] data) { this.data = data; }
    public String getAlgorithm() { return algorithm; }
    public void setAlgorithm(String algorithm) { this.algorithm = algorithm; }
    public String getOrder() { return order; }
    public void setOrder(String order) { this.order = order; }
}
