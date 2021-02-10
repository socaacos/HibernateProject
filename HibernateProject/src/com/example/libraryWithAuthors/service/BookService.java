package com.example.libraryWithAuthors.service;

import java.util.List;

import com.example.libraryWithAuthors.entities.Book;
import com.example.libraryWithAuthors.repository.BookRepository;

public class BookService {
	
	BookRepository bookRepo = new BookRepository();
	
	public List<Book> getAll()
	{
		return bookRepo.getAll();
	}
	
	public Book getById(int id)
	{
		return bookRepo.getById(id);
	}
	
	public void create(Book book)
	{
		bookRepo.create(book);
	}
	
	public void delete(int id) 
	{
		bookRepo.deleteById(id);
	}
	
	public void update(Book book, int id)
	{
		bookRepo.update(id, book);
	}
	

}
