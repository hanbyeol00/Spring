package com.han.contact.service;

import java.util.List;

import com.han.contact.persistence.ContactDao;


/**
 * Generic class
 * interface 들의 parents prototype
 * CRUD 를 구현하기 위하여 사용하는 여러 interface 들이 있는데
 * 이러한 interface 들에는 구현되지 않은 prototype 형태의 metgod 들이
 * 중복되어 정의 된다
 * 어차피 기본 CRUD 는 보통 같은 이름의 method 를 사용한다
 * 객체지향에서는 중복된 코드는 최소한으로 유지하는 것이 원칙이다
 * 이러한 원칙을 지키며 객체지향(특히 자바) 코드의 장점을 활용하는 것
 */
public interface GenericService<DTO, PK> {

	public List<DTO> selectAll();
	public DTO findById(PK uid);
	public int insert(DTO dto);
	public int update(DTO dto);
	public int delete(PK id);
	
}
