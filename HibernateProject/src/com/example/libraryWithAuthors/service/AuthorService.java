package com.example.libraryWithAuthors.service;

import java.util.List;

import com.example.libraryWithAuthors.entities.Author;
import com.example.libraryWithAuthors.repository.AuthorRepository;

public class AuthorService {
	
	AuthorRepository authRepo = new AuthorRepository();
	
	public List<Author> getAll()
	{
		return authRepo.getAll();
	}
	
	public Author getById(int id)
	{
		return authRepo.getById(id);
	}
	
	public void create(Author author)
	{
		authRepo.create(author);
	}
	
	public void delete(int id)
	{
		authRepo.deleteById(id);
	}
	
	public void update(Author author, int id)
	{
		authRepo.update(id, author);
	}

}
