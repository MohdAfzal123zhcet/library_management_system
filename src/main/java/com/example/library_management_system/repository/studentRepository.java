package com.example.library_management_system.repository;

import com.example.library_management_system.models.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<student,Integer> {

}
