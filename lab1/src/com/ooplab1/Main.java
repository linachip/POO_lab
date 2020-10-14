package com.ooplab1;

public class Main {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("Philips", "black", 23.8f,  1920, 1080);
        Monitor monitor2 = new Monitor("Acer", "grey", 27.0f, 2560, 1440);

        monitor1.monitorParameters();
        monitor2.monitorParameters();

        if(monitor1.dimension  > monitor2.dimension  && monitor1.resolution + monitor1.resolution2 > monitor2.resolution + monitor2.resolution2) {
            System.out.println("The parameters of " + monitor1.name + " is better than " + monitor2.name);
        } else{
            System.out.println("The parameters of " + monitor2.name + " is better than " + monitor1.name);
        }


        showUniversities();
    }

    private static void showUniversities() {
        University utm = new University("UTM", 1964);
        University usm = new University("USM", 1946);
        University ulim = new University("ULIM", 1992);

        Student student1 = new Student("Marina", 19, 8.6f);
        Student student2 = new Student("Ion", 20, 8.0f);
        Student student3 = new Student("Mark", 20, 9.5f);
        Student student4 = new Student("Ana", 21, 9.7f);
        Student student5 = new Student("Eva", 19, 9.0f);
        Student student6 = new Student("Serghei", 20, 8.5f);
        Student student7 = new Student("Gabriel", 21, 9.2f);
        Student student8 = new Student("Daniela", 20, 9.3f);
        Student student9 = new Student("Ivan", 20, 9.8f);

        utm.addStudent(student9);
        utm.addStudent(student1);
        utm.addStudent(student5);
        usm.addStudent(student8);
        usm.addStudent(student7);
        usm.addStudent(student2);
        ulim.addStudent(student3);
        ulim.addStudent(student4);
        ulim.addStudent(student6);

        float averageMark = utm.averageMark() + usm.averageMark() + ulim.averageMark();

        utm.showStudents();

        utm.Universities();

        System.out.println(utm.averageMark());
        System.out.println(usm.averageMark());
        System.out.println(ulim.averageMark());
        System.out.println(averageMark / 3);
    }
}
