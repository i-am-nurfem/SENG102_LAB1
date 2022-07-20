package Question2;

import java.util.*;

class StudentWorkload {
    int numOfQuiz, numOfHomework;
    String nameOfCourse;

    public StudentWorkload() {
    }

    StudentWorkload(int _numOfQuiz, int _numOfHomework, String _nameOfCourse) {
        this.numOfQuiz = _numOfQuiz;
        this.numOfHomework = _numOfHomework;
        this.nameOfCourse = _nameOfCourse;
    }


    public void Workload(List<StudentWorkload> students, String _nameOfCourse) {
        for (StudentWorkload sW : students) {
            if(sW.nameOfCourse.equals(_nameOfCourse)){
                int total = sW.numOfHomework + sW.numOfQuiz;
                System.out.println("Workload for " + sW.nameOfCourse + " is " + total);
            }
        }
    }

}

