package com.example.library_management_system.service.implementation;

import com.example.library_management_system.models.author;
import com.example.library_management_system.repository.authorRepository;
import com.example.library_management_system.service.authorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class authorServiceImplementation implements authorService {
@Autowired
authorRepository athrepo;
    @Override
    public String addauthor(author atr)
    {
       athrepo.save(atr);
       return "author added";
    }

}