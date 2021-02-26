package com.test.resource;

import com.test.entity.Contact;
import com.test.dto.ContactDTO;
import com.test.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/")
    public ContactDTO test(Long id){
        Contact contact = contactService.getStudent(id);
        ContactDTO studentDTO = new ContactDTO();
        studentDTO.id = contact.id;
        studentDTO.name = contact.name;
        return studentDTO;
    }

    @GetMapping("/hello")
    public String test1(){
        return "Hello!";
    }
}
