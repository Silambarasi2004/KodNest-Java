import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    Double javaScore;
}

public class Main {
    public static void main(String[] args) {
        Scanner student = new Scanner(System.in);
        Student st1 = new Student();
        Student st2 = new Student();

        st1.id = student.nextInt();
        st1.name = student.nextLine();
        st1.course = student.next();
        st1.javaScore = student.nextDouble();

        st1.id = student.nextInt();
        st1.name = student.nextLine();
        st1.course = student.next();
        st1.javaScore = student.nextDouble();

        System.out.println("Student_1 Profile");
        System.out.println("ID: " + st1.id);
        System.out.println("Name: " + st1.name);
        System.out.println("Course: " + st1.course);
        System.out.println("JavaScore: " + st1.javaScore);

        System.out.println("Student_2 Profile");
        System.out.println("ID: " + st2.id);
        System.out.println("Name: " + st2.name);
        System.out.println("Course: " + st2.course);
        System.out.println("JavaScore: " + st2.javaScore);

    }
}
