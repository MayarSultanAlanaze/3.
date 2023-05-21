package com.example.demo.Sarvice;

import com.example.demo.Model.Student;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;

@Valid
public class StudentSarvice {

    ArrayList<Student> students =new ArrayList<>();


    public ArrayList get(){
        return students;
    }


    public ArrayList add(){
        return students;
    }


    public ArrayList update(){
        return students;

    }

    public ArrayList delete(){
        return students;
    }


}
