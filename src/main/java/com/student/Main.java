package com.student;

import com.student.model.Student;
import com.student.service.AnalyticsService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.println("Enter details for 5 students:");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("CAT Marks (30): ");
            int cat = sc.nextInt();

            System.out.print("Assignment Marks (20): ");
            int assign = sc.nextInt();

            System.out.print("FAT Marks (50): ");
            int fat = sc.nextInt();

            students.add(new Student(name, cat, assign, fat));
        }

        AnalyticsService service = new AnalyticsService();

        service.printReport(students);

        Student topper = service.findTopper(students);
        System.out.println("\nTopper: " + topper.getName());

        double avg = service.calculateAverageMarks(students);
        System.out.println("Average Marks: " + avg);

        sc.close();
    }
}