package com.han.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.han.contact.models.ContactDto;
import com.han.contact.service.ContactService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value="/api")
public class ContactController {
	
	private final ContactService cntService;
	
	public ContactController(ContactService cntService) {
		super();
		this.cntService = cntService;
	}

	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<ContactDto> List() {
		List<ContactDto> contactList = cntService.selectAll();
		log.debug(contactList.toString());
		return contactList;
	}
	
	@RequestMapping(value="/detail")
	public ContactDto detail(String uid) {
		return cntService.findById(Long.valueOf(uid) - 1);
	}
}
