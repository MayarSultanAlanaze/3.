package com.example.demo.Sarvice;

import com.example.demo.Model.Teacher;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Valid
public class TeacherSarvice {

    ArrayList<Teacher> teachers=new ArrayList<>();

    @GetMapping("/get")
    public ArrayList get(){
        return teachers;
    }

    public ArrayList add(){
        return teachers;
    }

    public ArrayList update(){
        return teachers;

    }

    public ArrayList delete(){
        return teachers;
    }
}
