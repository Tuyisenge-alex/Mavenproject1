package com.mycompany.mavenproject1;

public class Mavenproject1 {

    public static void main(String[] args) {
        Student student1 = new Student("John", 20, 78);
        Student student2 = new Student("Alice", 19, 45);

        student1.displayInfo();
        student1.checkResult();

        System.out.println("-------------------");

        student2.displayInfo();
        student2.checkResult();
    }
}

// Define a class
class Student {
    private String name;
    private int age;
    private int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public void checkResult() {
        if (marks >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
