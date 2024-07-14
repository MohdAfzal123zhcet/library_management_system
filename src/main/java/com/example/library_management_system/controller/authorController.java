package com.example.library_management_system.controller;

import com.example.library_management_system.DTO.responseDto.getAuthorRespDto;
import com.example.library_management_system.models.author;
import com.example.library_management_system.service.authorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/getauthorByEmail")
    public getAuthorRespDto getAuthor(@RequestParam("email") String email)
    {
        return athrsrvc.getAuthor(email);
    }
}
