package com.test.service;

import com.test.entity.Contact;
import com.test.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    public ContactRepository contactRepository;

    @Override
    public Contact getStudent(Long id) {
        return contactRepository.findById(id).get();
    }
}
