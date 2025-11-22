package com.alper.studentapi.controller;

import com.alper.studentapi.model.Student;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    List<Student> students = new ArrayList<>();

    @GetMapping
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student added.";
    }
}
