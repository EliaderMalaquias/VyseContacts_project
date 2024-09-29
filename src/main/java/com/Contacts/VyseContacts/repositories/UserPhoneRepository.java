package com.Contacts.VyseContacts.repositories;

import com.Contacts.VyseContacts.model.UserPhone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface UserPhoneRepository extends JpaRepository<UserPhone, UUID> {

}
