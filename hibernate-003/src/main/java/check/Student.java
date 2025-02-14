package check;

public class Student {

    private int stdId;
    private String stdName;

    public Student(int stdId, String stdName)
    {
        super();
        this.stdId = stdId;
        this.stdName = stdName;
    }
    public int getEmpId() { return stdId; }
    public void setEmpId(int stdId) { this.stdId = stdId; }
    public String getEmpName() { return stdName; }
    public void setEmpName(String stdName)
    {
        this.stdName = stdName;
    }
}
