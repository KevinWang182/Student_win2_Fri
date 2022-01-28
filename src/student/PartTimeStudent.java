package student;

public class PartTimeStudent extends Student2{
    private int numCourses;
            
    public PartTimeStudent(String studentId, String studentName, int numCourses) {
        super(studentId, studentName);
        this.numCourses = numCourses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

}
