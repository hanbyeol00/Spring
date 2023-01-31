package com.han.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.han.contact.models.ContactDto;
import com.han.contact.service.ContactService;

@RestController
@RequestMapping(value="/db")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value={"/",""})
	public List<ContactDto> selectAll(){
		return contactService.selectAll();
	}

}
