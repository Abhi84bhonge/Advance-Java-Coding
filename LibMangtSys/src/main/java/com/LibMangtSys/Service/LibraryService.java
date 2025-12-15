package com.LibMangtSys.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LibMangtSys.DAO.LibraryDAO;
import com.LibMangtSys.Entity.Author;
import com.LibMangtSys.Entity.Books;
import com.LibMangtSys.Entity.Borrower;

@Service
public class LibraryService {
     
	@Autowired
	private LibraryDAO dao;
	
	
	public String addbooks(List<Books> books) {
		if(dao.addbooks(books)) {
		return "book added successfully";
		}else {
			return "something went wrong";
		}
	}


	public String addauthor(List<Author> authors) {
		if(dao.addauthor(authors)) {
			return "author addes successfully!!";
		}else {
			return "something went wrong";
		}
	}


	public String addonebook(Books book,Long authorid) {
		if(dao.addonebook(book,authorid)) {
			return "book added successfully!";
		}else {
			return "something went wrong";
		}
	}


	public String addborrower(Borrower borrower, Long book_id,Long book_id1) {
		if(dao.addborrower(borrower,book_id,book_id1)) {
			return "borrower added successfully";
		}else {
			return "something went wrong";
		}
	}


	
}
