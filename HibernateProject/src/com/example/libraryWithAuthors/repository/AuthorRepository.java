package com.example.libraryWithAuthors.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.example.libraryWithAuthors.entities.Author;
import com.example.libraryWithAuthors.entities.Book;

public class AuthorRepository {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public List<Author> getAll()
	{
		Session session = sessionFactory.openSession();
	    List<Author> authors =  (List<Author>) session.createQuery("SELECT a FROM Author a").list();   
	    session.close();
	    return authors;
	}
	
	public Author getById(int id)
	{
		Session session = sessionFactory.openSession();
		Author author = (Author) session.get(Author.class, id);  
	    session.close();
	    return author;
	}
	
	public void create(Author author)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(author);
		session.getTransaction().commit();
		session.close();
		
	}
	
	public void deleteById(int id)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Author author = (Author) session.get(Author.class, id);
	    BookRepository bookRepo = new BookRepository();
	    bookRepo.deleteByAuthor(author, session);
	    session.delete(author);
		session.getTransaction().commit();
	    session.close();
	}
	
	public void update(int id, Author author)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(author, id);
		session.getTransaction().commit();
		session.close();
		
	}

}
