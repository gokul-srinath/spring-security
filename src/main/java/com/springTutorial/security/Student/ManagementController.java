package com.springTutorial.security.Student;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/management/api/v1/students")
public class ManagementController {

    private final static List<Student> STUDENTS = Arrays.asList(
            new Student(1,"kundi"),
            new Student(2,"gokul"),
            new Student(3,"srinath")
    );

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_ADMINTRAINEE')")
    public List<Student> getStudents(){
        return STUDENTS;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('student:write')")
    public void createStudent(@RequestBody Student student){
        System.out.println(student.toString());
    }

    @DeleteMapping("{studentId}")
    @PreAuthorize("hasAuthority('student:write')")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println(studentId);
    }

    @PutMapping("{studentId}")
    @PreAuthorize("hasAuthority('student:write')")
    public void updateStudent(@PathVariable("studentId") Integer studentId,@RequestBody Student student){
        System.out.println(String.format("%s %s",studentId,student.toString()));
    }

}
