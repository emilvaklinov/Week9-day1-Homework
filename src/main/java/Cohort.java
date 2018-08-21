public class Cohort {

    private String studentName;
    private int number;

    public Cohort(String studentName, int number) {
        this.studentName = studentName;
        this.number = number;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
