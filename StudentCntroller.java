package com.example.demo.Cntroller;

import com.example.demo.Model.Student;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/student")
public class StudentCntroller {
    ArrayList<Student>students=new ArrayList<>();

    @GetMapping("/add")
    public Student addStudent(@Valid @RequestBody Student student) {
        students.add(student);
        return student;
    }


    @PutMapping("/update{index}")
    public Student updateStudent(@Valid @RequestBody Student student) {
        students.set(student);
        return student;

    }

    public Student deleteStudent(@Valid @RequestBody Student student) {
        students.remove(student);
        return student;
    }
}


