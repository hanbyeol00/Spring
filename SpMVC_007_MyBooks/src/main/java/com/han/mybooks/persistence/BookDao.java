package com.han.mybooks.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.han.mybooks.models.BookDto;

public interface BookDao extends GenericDao<BookDto, String> {

	public void create_books_table();

	@Select("SELECT * FROM tbl_books")
	public List<BookDto> selectAll();
	
	@Select("SELECT * FROM tbl_books WHERE isbn = #{isbn}")
	public BookDto findById(String isbn);
	
	@Delete("DELETE FROM tbl_books WHERE isbn=#{isbn}")
	public int delete(String isbn);
}
