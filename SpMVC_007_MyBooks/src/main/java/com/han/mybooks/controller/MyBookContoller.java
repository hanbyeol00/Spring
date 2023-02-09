package com.han.mybooks.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.han.mybooks.models.BookDto;
import com.han.mybooks.service.MyBookService;

@Controller
@RequestMapping(value = "/mybook")
public class MyBookContoller {

	private MyBookService myBookService;
	
	
	public MyBookContoller(MyBookService myBookService) {
		this.myBookService = myBookService;
	}
	


	@RequestMapping(value = "/list",method=RequestMethod.GET)
	public String list(Model model) {
		List<BookDto> bookList = myBookService.selectAll();
		model.addAttribute("BOOKS",bookList);
		return "books/list";
	}
	
}
