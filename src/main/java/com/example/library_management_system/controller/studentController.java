package com.example.library_management_system.controller;

import com.example.library_management_system.DTO.requestDto.studentReqDto;
import com.example.library_management_system.DTO.requestDto.updateStudentMobReqDto;
import com.example.library_management_system.DTO.responseDto.updateStudentMobRespDto;
import com.example.library_management_system.exceptions.StudentNotFounfException;
import com.example.library_management_system.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class studentController {
@Autowired
studentService stsr;
@PostMapping("/add")
    public String addstudent(@RequestBody studentReqDto s)
    {
         return stsr.addStudent(s);
    }
    @PutMapping("/update")
    public updateStudentMobRespDto updateMob(@RequestBody updateStudentMobReqDto updatestudentMobReqDto)throws StudentNotFounfException
    {
       return stsr.updateMob(updatestudentMobReqDto);
    }
}
