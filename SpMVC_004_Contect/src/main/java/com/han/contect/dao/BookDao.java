package com.han.contect.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.han.contect.modals.Book;

public interface BookDao {
	
	@Select("SELECT * FROM tbl_books")
	public List<Book> selectAll();
	
}
