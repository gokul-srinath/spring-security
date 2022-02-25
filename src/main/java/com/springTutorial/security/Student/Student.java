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

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
