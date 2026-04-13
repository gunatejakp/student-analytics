package com.student.service;

import com.student.model.Student;
import java.util.List;

public class AnalyticsService {

    public Student findTopper(List<Student> students) {
        Student topper = students.get(0);

        for (Student s : students) {
            if (s.getTotalMarks() > topper.getTotalMarks()) {
                topper = s;
            }
        }
        return topper;
    }

    public double calculateAverageMarks(List<Student> students) {
        int sum = 0;

        for (Student s : students) {
            sum += s.getTotalMarks();
        }

        return (double) sum / students.size();
    }

    public void printReport(List<Student> students) {
        System.out.println("\n---- Student Report ----");

        for (Student s : students) {
            System.out.println(
                s.getName() + " | Total: " + s.getTotalMarks() +
                " | GPA: " + s.getGPA() +
                " | Grade: " + s.getGrade()
            );
        }
    }
}