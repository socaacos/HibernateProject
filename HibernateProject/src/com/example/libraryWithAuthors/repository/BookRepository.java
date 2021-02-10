package com.example.libraryWithAuthors.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.example.libraryWithAuthors.entities.Author;
import com.example.libraryWithAuthors.entities.Book;

public class BookRepository {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public List<Book> getAll()
	{
		Session session = sessionFactory.openSession();
	    List<Book> books =  (List<Book>) session.createQuery("SELECT a FROM Book a").list();   
	    session.close();
	    return books;
	}
	
	public Book getById(int id)
	{
		Session session = sessionFactory.openSession();
	    Book book = (Book) session.get(Book.class, id);  
	    session.close();
	    return book;
	}
	
	public void create(Book book)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		session.close();
		
	}
	
	public void deleteById(int id)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	    Book book = (Book) session.get(Book.class, id);
	    
	    session.delete(book);
		session.getTransaction().commit();
	    session.close();
	}
	
	public void deleteByAuthor(Author author, Session session)
	{
	   session.createQuery("Delete FROM Book WHERE author_id="+ author.getId()).executeUpdate();   

	}
	
	public void update(int id, Book book)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(book, id);
		session.getTransaction().commit();
		session.close();
		
	}

	
}
