package com.bookapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookapi.model.Book;
import com.bookapi.service.BookService;

@CrossOrigin("*")
@RestController
public class BookRestController {
	
	@Autowired
	private BookService service;

	//home
	@GetMapping("/")
	public List<Book> home() {
		return service.getAllBooks();
	}
	
	//all books
	@GetMapping("/books")
	public List<Book> findAllBooks() {
		return service.getAllBooks();
	}
	
	//add book
	@PostMapping("/book")
	public void addBook(@RequestBody Book book) {
		service.addBook(book);
	}
	
	//get one book
	@GetMapping("/book/{id}")	
	public Book getBook(@PathVariable("id") long id) {
		return service.findBook(id);
	}
	
	//delete book
	@DeleteMapping("/book/{id}")
	public void removeBook(@PathVariable("id") long id) {
		service.removeBook(id);
	}
	
	//update Book
	@PutMapping("/book")
	public void updateBook(@RequestBody Book book) {
		service.addBook(book);
	}
}
