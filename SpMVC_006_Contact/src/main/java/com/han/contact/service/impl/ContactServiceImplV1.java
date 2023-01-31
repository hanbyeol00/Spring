package com.han.contact.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.han.contact.models.ContactDto;
import com.han.contact.persistence.ContactDao;
import com.han.contact.service.ContactService;

@Service
public class ContactServiceImplV1 implements ContactService{
	
	@Autowired
	private ContactDao contactDao;

	@Override
	public List<ContactDto> selectAll() {
		return contactDao.selectAll();
	}
	
}
