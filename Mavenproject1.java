package com.mycompany.mavenproject1;

public class Mavenproject1 {

    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        student1.displayInfo();
    }
}

// Define a class
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
