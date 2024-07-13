package com.example.library_management_system.service.implementation;

import com.example.library_management_system.models.author;
import com.example.library_management_system.models.book;
import com.example.library_management_system.repository.authorRepository;
import com.example.library_management_system.repository.bookRepository;
import com.example.library_management_system.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookServiceImplementation implements bookService {
    @Autowired
    authorRepository athrep;
    @Override
    public String addbook(book b) throws Exception
    {
        author athr;
        try{
            athr=athrep.findById(b.getAth().getAid()).get();
        }
        catch (Exception e)
        {
            throw new Exception("Author not present");
        }

         athr.getB().add(b);
        b.setAth(athr);
        athrep.save(athr);
        return "book added";
    }

}
