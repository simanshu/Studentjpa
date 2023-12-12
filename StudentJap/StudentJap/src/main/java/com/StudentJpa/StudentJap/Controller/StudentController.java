package com.StudentJpa.StudentJap.Controller;

import com.StudentJpa.StudentJap.Model.Student;
import com.StudentJpa.StudentJap.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/save")
    public String AddStudent(@RequestBody Student s){
        studentService.AddStudent(s);
        return "Student got Added Succesfully";
    }
}
