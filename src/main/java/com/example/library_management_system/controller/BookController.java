package com.example.library_management_system.controller;

import com.example.library_management_system.models.book;
import com.example.library_management_system.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    bookService bksrvc;

    @PostMapping("/add")
    public String addbook(@RequestBody book b) throws Exception
    {
        return bksrvc.addbook(b);
    }
}
