package com.StudentJpa.StudentJap.Repository;

import com.StudentJpa.StudentJap.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {
}
