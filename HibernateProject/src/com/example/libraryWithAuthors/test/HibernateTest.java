package com.example.libraryWithAuthors.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.example.libraryWithAuthors.Adress;
import com.example.libraryWithAuthors.FourWheeler;
import com.example.libraryWithAuthors.TwoWheeler;
import com.example.libraryWithAuthors.UserDetails;
import com.example.libraryWithAuthors.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		
		/*Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");			
		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("Bike");
		bike.setSteeringHandle("Bike Steering Handle");		
		FourWheeler car = new FourWheeler();
		car.setVehicleName("Porshe");
		car.setSteeringWheel("Porshe steering handle.");*/ //INHERITANCE
		
		UserDetails user = new UserDetails();
		user.setUserName("Sofija Jakovljevic");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		
		/*for(int i = 0; i<10; i++)
		{
			UserDetails user = new UserDetails();
			user.setUserName("User" + i);
			session.save(user);
		}*/ //CREATE USER
		/*UserDetails user = (UserDetails) session.get(UserDetails.class, 4);
		session.delete(user);
		user.setUserName("Updated User");
		session.update(user);*/ //CRUD 
		session.getTransaction().commit();
		session.close(); 
}

}
