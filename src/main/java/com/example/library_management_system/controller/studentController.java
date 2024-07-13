package com.example.library_management_system.controller;

import com.example.library_management_system.models.student;
import com.example.library_management_system.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class studentController {
@Autowired
studentService stsr;
@PostMapping("/add")
    public String addstudent(@RequestBody student s)
    {
         return stsr.addStudent(s);
    }
}
