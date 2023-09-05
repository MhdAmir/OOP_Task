/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1_3Class;

/**
 *
 * @author mamir
 */
public class Course {
    private String courseName;
    private String teacher;
    private int creditHours;

    public Course(String courseName, String teacher, int creditHours) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.creditHours = creditHours;
    }

  
    public String getCourseName() {
        return courseName;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + teacher);
        System.out.println("Credit Hours: " + creditHours);
    }

    public void addStudentToCourse(Student student) {
        System.out.println("Added " + student.getFullName() + " to " + courseName);
    }
}
