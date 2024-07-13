package com.example.library_management_system.service.implementation;

import com.example.library_management_system.enums.Status;
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
    public String addStudent(student s) {
      //generate card for student
       card cd=new card();
       cd.setStatus(Status.Active);
       cd.setValidtill("2024-09-01");
       cd.setSt(s);
       s.setCrd(cd);
       studentrepository.save(s);
       return "student added";

    }
}
