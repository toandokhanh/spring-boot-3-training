package com.toandokhanh.demorestfullapi.rest;
import com.toandokhanh.demorestfullapi.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentRestController {
    private List<Student> students;

    @PostConstruct
    public void loadStudents(){
        students = new ArrayList<>();
        students.add(new Student("Toan", "Do"));
        students.add(new Student("Cao", "An"));
        students.add(new Student("Dinh", "Vi"));
    }
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        if((studentId >= students.size()) || (studentId < 0)){
            throw new StudentNotFoundException("Student id not found -  "+studentId);
        }
        return students.get(studentId);
    }
}
