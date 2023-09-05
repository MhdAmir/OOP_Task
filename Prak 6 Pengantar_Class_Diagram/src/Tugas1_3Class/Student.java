/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1_3Class;

/**
 *
 * @author mamir
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void printStudentInfo() {
        System.out.println("Full Name: " + getFullName());
        System.out.println("Age: " + age);
    }

    public void enrollInCourse(String courseName) {
        System.out.println(getFullName() + " is enrolled in the course: " + courseName);
    }

}
