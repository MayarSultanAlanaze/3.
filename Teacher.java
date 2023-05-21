package com.example.demo.Model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher {


    @NotEmpty (message = " the id should  not be empty")
   private String id;

    @NotEmpty (message = " the name should  not be empty")
    private String name;

    @NotNull (message = " the salary should  not be empty")
    private int salary;

}
