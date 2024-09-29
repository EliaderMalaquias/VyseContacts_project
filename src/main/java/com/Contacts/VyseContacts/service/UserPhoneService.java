package com.Contacts.VyseContacts.service;

import com.Contacts.VyseContacts.model.UserPhone;
import com.Contacts.VyseContacts.repositories.UserPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPhoneService {

    @Autowired
    private UserPhoneRepository repository;

    public UserPhone saveUserPhone(UserPhone userPhone) {
        return repository.save(userPhone);
    }


}
