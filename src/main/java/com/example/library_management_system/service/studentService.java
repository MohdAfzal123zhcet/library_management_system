package com.example.library_management_system.service;

import com.example.library_management_system.DTO.requestDto.studentReqDto;
import com.example.library_management_system.DTO.requestDto.updateStudentMobReqDto;
import com.example.library_management_system.DTO.responseDto.updateStudentMobRespDto;
import com.example.library_management_system.exceptions.StudentNotFounfException;
import com.example.library_management_system.models.student;

public interface studentService {
    public String addStudent(studentReqDto s);
    public updateStudentMobRespDto updateMob(updateStudentMobReqDto updatestudentMobReqDto)throws StudentNotFounfException;
}
