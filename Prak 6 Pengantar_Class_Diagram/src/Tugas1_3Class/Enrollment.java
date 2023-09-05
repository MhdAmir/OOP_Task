/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1_3Class;

/**
 *
 * @author mamir
 */
public class Enrollment {
    private Student student;
    private Course course;
    private int grade;

    public Enrollment(Student student, Course course, int grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public void displayEnrollmentInfo() {
        System.out.println("Student: " + student.getFullName());
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Grade: " + grade);
    }

    public void updateGrade(int newGrade) {
        grade = newGrade;
        System.out.println("Updated grade for " + student.getFullName() + " in " + course.getCourseName() + " to " + grade);
    }

}
