package com.han.contact.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.han.contact.models.BookDto;
import com.han.contact.persistence.BookDao;
import com.han.contact.service.BookService;

@Service
public class BookServiceImplV1 implements BookService{
	
	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<BookDto> selectAll() {

		return bookDao.selectAll();
	}

	@Override
	public BookDto findByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BookDto bookDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BookDto bookDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String isbn) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
