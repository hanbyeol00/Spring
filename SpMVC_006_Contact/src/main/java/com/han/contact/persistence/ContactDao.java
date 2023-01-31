package com.han.contact.persistence;

import java.util.List;

import com.han.contact.models.ContactDto;


public interface ContactDao {

	public List<ContactDto> selectAll();
	
}
