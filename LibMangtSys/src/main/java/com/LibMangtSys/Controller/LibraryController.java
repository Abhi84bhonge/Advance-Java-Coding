package com.LibMangtSys.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LibMangtSys.Entity.Author;
import com.LibMangtSys.Entity.Books;
import com.LibMangtSys.Entity.Borrower;
import com.LibMangtSys.Service.LibraryService;

@RestController
@RequestMapping("/www.Library_Mangt_Sys")
public class LibraryController {

	@Autowired
	private LibraryService service;
	
	@GetMapping("/getmsg")
	public String getmsg() {
		return "!!!Welcome to Library Management System!!!";
	}
	
	@PostMapping("/addbooks")
	public String addbooks(@RequestBody List<Books> books) {
		return service.addbooks(books);
	}
	
	
	@PostMapping("/addauthor")
	public String addauthor(@RequestBody List<Author> authors){
		return service.addauthor(authors);
	}
	
	@PostMapping("/addonebook/{authorid}")
	public String addonebook(@RequestBody Books book,@PathVariable Long authorid) {
		return service.addonebook(book,authorid);
	}
	
	@PostMapping("/addborrower/{book_id}/{book_id1}")
	public String addborrower(@RequestBody Borrower borrower,@PathVariable Long book_id,@PathVariable Long book_id1) {
		return service.addborrower(borrower,book_id,book_id1);
	}
	
}
