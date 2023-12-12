package com.StudentJpa.StudentJap.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
    @Id
    @Column(unique = true)
     int RollNum;
    String Name;
    int age;

    public Student(int rollNum, String name, int age) {
        this.RollNum = rollNum;
        this.Name = name;
        this.age = age;
    }

    public Student() {

    }

    public int getRollNum() {
        return RollNum;
    }

    public void setRollNum(int rollNum) {
        RollNum = rollNum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
