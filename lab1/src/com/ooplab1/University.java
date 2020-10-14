package com.ooplab1;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String uniName;
    private int foundationYear;
    private List<Student> students = new ArrayList<>();

    University(String uniName, int foundationYear) {
        this.uniName = uniName;
        this.foundationYear = foundationYear;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public float averageMark() {
        float sum = 0;

        for (Student student : students) {
            sum += student.getMark();
        }
        if (students.size() > 0) {
            return sum / students.size();
        } else {
            return sum;
        }
    }

    public void showStudents(){
        System.out.println("Students: ");
        for(Student student: students){
            System.out.println(student.getName());
        }
    }
    public void Universities(){
        System.out.println(uniName);
        System.out.println(foundationYear);
    }
}
