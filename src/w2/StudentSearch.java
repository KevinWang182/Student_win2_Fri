package w2;

import java.util.Scanner;

public class StudentSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Student1[] students = new Student1[9];
        students[0] = new Student1("Adam", "111");
        students[1] = new Student1("Bob", "222");
        students[2] = new Student1("Charles", "333");
        students[3] = new Student1("David", "444");
        students[4] = new Student1("Edward", "555");
        students[5] = new Student1("Frank", "666");
        students[6] = new Student1("George", "777");
        students[7] = new Student1("Hank", "888");
        students[8] = new Student1("Ivan", "999");
        
        System.out.print("Enter Student Number: ");
        String key = input.next();
        
        String name = "Student not found";
        for(Student1 n: students)
            if(key.equals(n.getNumber()))
                name = n.getName();
        
        System.out.println(name);
    }
    
}
