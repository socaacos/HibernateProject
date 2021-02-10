package com.example.libraryWithAuthors.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String publisher;
	
	private String title;
	
	private int numPages;
	
	private int publicationYear;
	
	@ManyToOne
	private Author author;

}
