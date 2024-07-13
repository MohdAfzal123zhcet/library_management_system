package com.example.library_management_system.controller;

import com.example.library_management_system.models.author;
import com.example.library_management_system.service.authorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class authorController {
    @Autowired
    authorService athrsrvc;
    @PostMapping("/add")
    public String addauthor(@RequestBody author atr)
    {
        return athrsrvc.addauthor(atr);
    }
}
