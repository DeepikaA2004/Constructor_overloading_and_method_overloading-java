import java.util.Scanner;

public class Student {
    String name;
    String stu_id;
    private int mark1;
    private int mark2;
    private int score;

    public Student(String initName) {
        name = initName;
    }

    // constructor overloading
    public Student(String initName, String initId) {
        name = initName;
        stu_id = initId;
    }

    public void setMarks(int m1, int m2) {
        mark1 = m1;
        mark2 = m2;
    }

    public void calculateScore() {
        score = (mark1 + mark2) / 2;
    }

    // method overloading
    public void calculateScore(int attendance) {
        score = (mark1 + mark2) / 2 + (attendance / 20);
    }

public void display(){
4
System.out.println("The Name is " + name );
System.out.println("The id is " + stu_id );
System.out.println("The score is " + score );
}
}

class StdDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Student 1
        System.out.println("Input Student Name, ID :");
        String s = in.next();
        String id = in.next();
        Student stu1 = new Student(s, id);
        System.out.println("Input marks one and two :");
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        stu1.setMarks(m1, m2);
        stu1.calculateScore();
        stu1.display();
        // Student 2
        System.out.println("Input Student Name :");
        String s1 = in.next();
        Student stu2 = new Student(s1);
        System.out.println("Input marks one and two :");
        int m11 = in.nextInt();
        int m22 = in.nextInt();
        System.out.println("Input attendance :");
        int a = in.nextInt();
        stu2.setMarks(m11, m22);
        stu2.calculateScore(a);
        stu2.display();
        in.close();
    }
}
