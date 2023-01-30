package com.han.contect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.han.contect.modals.Contact;
import com.han.contect.service.ContactService;

/**
 * RestController
 * 자체 view 가 없는 api 전용 controller
 * 
 * Controller + ResponseBody 의 조합으로 api Controller 를
 * 설정하는데
 * view 가 필요없는 프로젝트에서는 RestController 설정만으로
 * api 전용 Controller 를 만든다
 */
@RestController
@RequestMapping(value="/api")
public class ContectController {
	
	@Autowired
	private ContactService cService;
	
	/**
	 * Controller 에서 사용하는 return type
	 * Controller 는 기본 type 으로 보통 String 만을 사용한다
	 * 숫자, 클래스, 등등의 데이터는 기본적으로
	 * return type 으로 사용할수 없다
	 * @return
	 */
	@RequestMapping(value="/list/json", 
			produces = "application/json;charset=UTF-8")
	public List<Contact> listAllJSON() {
//		Contact result = cService.finById(null);
		
		List<Contact> contactList = cService.selectAll();
		return contactList;
	}
	@RequestMapping(value="/list/xml", produces = "application/xml;charset=UTF-8")
	public Contact listAllXML() {
		Contact result = cService.finById(null);
		return result;
	}

}
