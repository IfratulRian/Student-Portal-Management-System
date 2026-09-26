package model.academic;

public class Batch {

    private long batchId;
    private String batchName;
    private int year;

    public Batch(long batchId, String batchName, int year) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.year = year;
    }

    public long getBatchId() {
        return batchId;
    }

    public void setBatchId(long batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchId=" + batchId +
                ", batchName='" + batchName + '\'' +
                ", year=" + year +
                '}';
    }
}