package com.example.library_management_system.repository;

import com.example.library_management_system.models.author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface authorRepository extends JpaRepository<author,Integer> {
}
