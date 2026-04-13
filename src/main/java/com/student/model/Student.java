package com.student.model;

public class Student {
    private String name;
    private int catMarks;
    private int assignmentMarks;
    private int fatMarks;

    public Student(String name, int catMarks, int assignmentMarks, int fatMarks) {
        this.name = name;
        this.catMarks = catMarks;
        this.assignmentMarks = assignmentMarks;
        this.fatMarks = fatMarks;
    }

    public String getName() {
        return name;
    }

    public int getTotalMarks() {
        return catMarks + assignmentMarks + fatMarks;
    }

    public double getGPA() {
        int total = getTotalMarks();

        if (total >= 90) return 10.0;
        else if (total >= 80) return 9.0;
        else if (total >= 70) return 8.0;
        else if (total >= 60) return 7.0;
        else if (total >= 50) return 6.0;
        else return 5.0;
    }

    public String getGrade() {
        int total = getTotalMarks();

        if (total >= 90) return "A+";
        else if (total >= 80) return "A";
        else if (total >= 70) return "B";
        else if (total >= 60) return "C";
        else if (total >= 50) return "D";
        else return "F";
    }
}