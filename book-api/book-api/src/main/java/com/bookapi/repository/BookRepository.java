package com.bookapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookapi.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
