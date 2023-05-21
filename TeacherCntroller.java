package com.example.demo.Cntroller;

import com.example.demo.Model.Teacher;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/Teacher")
public class TeacherCntroller {

    ArrayList<Teacher> teachers=new ArrayList<>();


    @GetMapping("/add")
    public Teacher addTeacher(@Valid @RequestBody Teacher teacher){
       teachers.add(teacher);
        return teachers;
    }

    @PostMapping("/update")
    public Teacher updateTeacher(@Valid @RequestBody Teacher teacher){
        teachers.set(teacher);
        return teachers ;
    }

    @DeleteMapping("/delete")
    public Teacher deleteTeacher(@RequestBody Teacher teacher){
        teachers.remove(teacher);
        return teachers;
    }
}

