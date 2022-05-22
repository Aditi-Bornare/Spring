package com.contact.service;

import com.contact.beans.Contact;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImplementation implements ContactService{

    List<Contact> list = List.of(
            new Contact(101L,"Sachin","sachin@gmail.com",1001L),
            new Contact(102L,"Sehwag","viru@gmail.com",1001L),
            new Contact(103L,"Dhoni","mahi@gmail.com",1002L),
            new Contact(104L,"Zaheer","zaheer@gmail.com",1003L)
    );

    @Override
    public List<Contact> getContacts_User(Long userId) {
        return list.stream().filter((contact -> contact.getUserId().equals(userId))).collect(Collectors.toList());
    }
}
