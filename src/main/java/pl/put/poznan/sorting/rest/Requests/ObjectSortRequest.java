package pl.put.poznan.sorting.rest.Requests;

public class ObjectSortRequest {
    // Each inner array represents one object, with attributes addressed by index.
    private long[][] data;
    private String algorithm = "bubble";
    private String order = "asc";
    private Integer index = 0;

    public long[][] getData() { return data; }
    public void setData(long[][] data) { this.data = data; }
    public String getAlgorithm() { return algorithm; }
    public void setAlgorithm(String algorithm) { this.algorithm = algorithm; }
    public String getOrder() { return order; }
    public void setOrder(String order) { this.order = order; }
    public Integer getIndex() { return index; }
    public void setIndex(Integer index) { this.index = index; }
}
