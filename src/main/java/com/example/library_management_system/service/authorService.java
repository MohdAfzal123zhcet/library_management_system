package com.example.library_management_system.service;

import com.example.library_management_system.DTO.responseDto.getAuthorRespDto;
import com.example.library_management_system.models.author;

public interface authorService {
    public String addauthor(author athr);
    public getAuthorRespDto getAuthor(String email);
}
