package com.example.libraryWithAuthors.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Author {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	
}
