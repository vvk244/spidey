package com.bookapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapi.model.Book;
import com.bookapi.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repo;
	
	public List<Book> getAllBooks(){
		return (List<Book>) repo.findAll();
		
	}
	
	public void addBook(Book book) {
		repo.save(book);
	}

	public Book findBook(Long id) {
		return repo.findById(id).orElse(new Book());
		
	}

	public void removeBook(long id) {
		repo.deleteById(id);
	}

}
