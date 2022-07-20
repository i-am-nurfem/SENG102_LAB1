package Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String args[]) {

        int numOfCourse, numOfQuiz, numOfHomework;
        String nameOfCourse;

        StudentWorkload studentWorkload = new StudentWorkload();
        List<StudentWorkload> students = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of courses: ");
        numOfCourse = scan.nextInt();

        while(numOfCourse > 0){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Enter the name of course: ");
            nameOfCourse = scan2.nextLine();
            System.out.println("Enter the number of quiz: ");
            numOfQuiz = scan2.nextInt();
            System.out.println("Enter the number of homework: ");
            numOfHomework = scan2.nextInt();
            students.add(new StudentWorkload(numOfQuiz, numOfHomework, nameOfCourse));
            numOfCourse--;

        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter course name to display total workload or press q to quit:");
        nameOfCourse = scanner.nextLine();
        studentWorkload.Workload(students, nameOfCourse);

    }
}
