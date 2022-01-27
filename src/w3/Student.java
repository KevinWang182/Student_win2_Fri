package w3;

public class Student extends Person{
    private String number;
    private double GPA;

    public Student(String number, double GPA, String name, String DOB) {
        super(name, DOB);
        this.number = number;
        this.GPA = GPA;
    }
    
}
