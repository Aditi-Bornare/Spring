package com.contact.service;

import com.contact.beans.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> getContacts_User(Long userId);
}
