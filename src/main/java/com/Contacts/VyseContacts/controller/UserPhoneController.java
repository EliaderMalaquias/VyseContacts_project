package com.Contacts.VyseContacts.controller;

import com.Contacts.VyseContacts.model.UserPhone;
import com.Contacts.VyseContacts.service.UserPhoneService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserPhoneController {

    @Autowired
    private UserPhoneService userPhoneService;

    @PostMapping(value = ("/create"))
    public ResponseEntity createUser(@RequestBody @Valid UserPhone user) {
       userPhoneService.saveUserPhone(user);
       return ResponseEntity.ok(user);
    }
}
