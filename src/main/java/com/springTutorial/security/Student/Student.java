package com.springTutorial.security.Student;

public class Student {
    private final Integer StudentId;
    private final String name;

    public Student(Integer studentId, String name) {
        StudentId = studentId;
        this.name = name;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public String getName() {
        return name;
    }
}
