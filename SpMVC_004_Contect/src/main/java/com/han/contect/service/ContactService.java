package com.han.contect.service;

import java.util.List;

import com.han.contect.modals.Contact;

public interface ContactService {

	public List<Contact> selectAll();
	public Contact finById(String id);
	
	public int insert(Contact contact);
	public int update(Contact contact);
	public int delete(Contact contact);
	
}
