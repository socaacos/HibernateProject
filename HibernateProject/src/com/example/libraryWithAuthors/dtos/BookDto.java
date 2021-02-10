package com.example.libraryWithAuthors.dtos;

import com.example.libraryWithAuthors.entities.Author;

import lombok.Data;

@Data
public class BookDto 
{
	private Integer id;
	private String title;
	private String publisher;
	private int publicationYear;
	private int numPages;
	private Author author;
}

