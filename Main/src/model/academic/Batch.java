package model.academic;

public class Batch implements Comparable<Batch> {

    private String batchId;
    private String batchName;
    private Department department;
    private int year;

    public Batch(String batchId, String batchName, Department department, int year) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.department = department;
        this.year = year;
    }

    public String getBatchId() {
        return batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public Department getDepartment() {
        return department;
    }

    public int getYear() {
        return year;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Batch other) {
        return batchId.compareTo(other.batchId);
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchId='" + batchId + '\'' +
                ", batchName='" + batchName + '\'' +
                ", department='" + department.getDepartmentName() + '\'' +
                ", year=" + year +
                '}';
    }
}