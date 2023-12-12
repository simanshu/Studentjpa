package com.StudentJpa.StudentJap.Service;

import com.StudentJpa.StudentJap.Model.Student;
import com.StudentJpa.StudentJap.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void AddStudent(Student s){
        studentRepository.save(s);

    }
}
