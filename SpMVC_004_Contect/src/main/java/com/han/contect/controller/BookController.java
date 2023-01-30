package com.han.contect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.han.contect.dao.BookDao;
import com.han.contect.modals.Book;

@RestController
@RequestMapping(value="/book")
public class BookController {
	
	@Autowired
	private BookDao bookDao;
	
	@RequestMapping(value= {"/",""})
	public List<Book> List() {
		return bookDao.selectAll();
	}
	
}
