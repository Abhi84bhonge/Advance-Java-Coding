package com.LibMangtSys.DAO;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.LibMangtSys.Entity.Author;
import com.LibMangtSys.Entity.Books;
import com.LibMangtSys.Entity.Borrower;

@Repository
public class LibraryDAO {

	@Autowired
	private SessionFactory sf;
	
	public boolean addbooks(List<Books> books) {
		Session sn=sf.openSession();
		
		
	   for (Books books2 : books) {
		   	sn.save(books2);	
	}

		sn.beginTransaction().commit();
		sn.close();
		return true;
	}

	public boolean addauthor(List<Author> authors) {
		Session sn=sf.openSession();
		for(Author authors1:authors) {
			sn.save(authors1);
		}
	    sn.beginTransaction().commit();
	    sn.close();
	    return true;
	
	}

	public boolean addonebook(Books book,Long authorid) {
		Session sn=sf.openSession();
		Author author=sn.get(Author.class, authorid);
		
		book.setAuthor(author);
		sn.save(book);
		sn.beginTransaction().commit();
		sn.close();
		return true;
		
	}

	public boolean addborrower(Borrower borrower, Long book_id,Long book_id1) {
	Session sn=sf.openSession();
	Books book=sn.get(Books.class, book_id);
	Books book1=sn.get(Books.class, book_id1);
	
	Set<Books> books=new HashSet<>();
	 books.add(book1);
	 books.add(book);
	 
	 borrower.setBooks(books);
	 sn.save(borrower);
	 sn.beginTransaction().commit();
	 sn.close();
	 return true;
	}

	
}
