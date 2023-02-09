package com.han.mybooks.service;

import java.util.List;

import com.han.mybooks.models.BookDto;
import com.han.mybooks.persistence.GenericDao;

public interface MyBookService extends GenericDao<BookDto, String> {

	public List<BookDto> findByTitle(String title);
	public List<BookDto> findByAuthor(String author);
	public List<BookDto> findByPublisher(String publisher);
	
}
