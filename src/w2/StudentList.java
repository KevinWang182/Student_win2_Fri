package w2;

import java.util.Arrays;

public class StudentList {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Bob", "123", 12);
        students[1] = new Student("Joe", "456", 12);
        students[2] = new Student("George", "583", 19);
        students[3] = new Student("Annie", "367", 21);
        students[4] = new Student("Sarah", "014", 18);
        
        Arrays.sort(students);
        
        for(Student s: students)
            System.out.println(s);
    }
    
}
