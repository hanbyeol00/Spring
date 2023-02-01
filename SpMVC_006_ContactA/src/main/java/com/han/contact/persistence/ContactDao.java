package com.han.contact.persistence;

import com.han.contact.models.ContactDto;
import com.han.contact.service.GenericService;


public interface ContactDao extends GenericService<ContactDto, Long> {

	
	// 프로젝트가 시작될때 table을 자동 생성하기 위한 method 정의
	public void create_contact_table();
	public void create_hobby_table();
}
