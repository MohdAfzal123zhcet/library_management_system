package com.example.library_management_system.service.implementation;

import com.example.library_management_system.DTO.requestDto.studentReqDto;
import com.example.library_management_system.DTO.requestDto.updateStudentMobReqDto;
import com.example.library_management_system.DTO.responseDto.updateStudentMobRespDto;
import com.example.library_management_system.enums.Status;
import com.example.library_management_system.exceptions.StudentNotFounfException;
import com.example.library_management_system.models.card;
import com.example.library_management_system.models.student;
import com.example.library_management_system.repository.studentRepository;
import com.example.library_management_system.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentServiceimplementation implements studentService {

  @Autowired
  studentRepository studentrepository;

    @Override
    public String addStudent(studentReqDto s) {

        student stu=new student();
        stu.setName(s.getName());
        stu.setDep(s.getDep());
        stu.setMob(s.getMob());

      //generate card for student
        card cd=new card();
       cd.setStatus(Status.Active);
       cd.setValidtill("2024-09-01");
       cd.setSt(stu);
       stu.setCrd(cd);
       studentrepository.save(stu);
       return "student added";

    }
    @Override
    public updateStudentMobRespDto updateMob(updateStudentMobReqDto updatestudentmobReqDto) throws StudentNotFounfException
    {
      student s,s1;
      try
      {
         s= studentrepository.findById(updatestudentmobReqDto.getId()).get();
          s.setMob(updatestudentmobReqDto.getMob());
          s1=studentrepository.save(s);

          //response dto
          updateStudentMobRespDto updatestudentMobRespDto=new updateStudentMobRespDto();
          updatestudentMobRespDto.setName(s1.getName());
          updatestudentMobRespDto.setMob(s1.getMob());
          return updatestudentMobRespDto;
      }
      catch(Exception e)
      {
         throw new StudentNotFounfException("invalid student id");
      }

    }
}
