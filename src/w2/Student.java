package w2;

public class Student implements Comparable<Student>{
    private String name;
    private String number;
    private int age;

    public Student(String name, String number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }

    public int compareTo(Student o) {
        return age - o.age;
    }
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", number=" + number + ", age=" + age + '}';
    }
}
