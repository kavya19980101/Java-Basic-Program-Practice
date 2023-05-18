package Assignment.Assigment1;

public class ATB {

    private int Batchno;
    private String course;

    ATB(int Batchno, String course)
    {
        this.Batchno=Batchno;
        this.course=course;
    }

    public String toString() {
        return "ATB{" +
                "Batchno=" + Batchno +
                ", course='" + course + '\'' +
                '}';
    }
}
