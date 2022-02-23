package com.springTutorial.security.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final static List<Student> STUDENTS = Arrays.asList(
        new Student(1,"kundi"),
        new Student(2,"gokul"),
        new Student(3,"srinath")
    );

    @GetMapping("{StudentId}")
    public Student getStudentById(@PathVariable("StudentId") Integer StudentId) {
        return STUDENTS.stream().filter((Student student)-> StudentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("Student with Id "+StudentId+" Not Found!"));
    }
}
