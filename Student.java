package com.example.demo.Model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

    @NotEmpty(message = " the id should  not be empty")
    private String ID;

    @NotEmpty(message = " the name should not be empty")
    private String name;

    @NotNull(message = " the age should not be empty")
    private int age;

    @NotEmpty(message = " the major should not be empty")
    private String major;

}

