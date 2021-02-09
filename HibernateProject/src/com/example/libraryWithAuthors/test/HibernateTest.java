package com.example.libraryWithAuthors.test;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.example.libraryWithAuthors.Adress;
import com.example.libraryWithAuthors.UserDetails;
import com.example.libraryWithAuthors.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user = new UserDetails();
		Vehicle vehicle = new Vehicle();
		Vehicle vehicle2 = new Vehicle();
		
		vehicle.setVehicleName("Car");
		vehicle2.setVehicleName("Jeep");
		
		user.setUserName("sofijaJakovljevic");
		
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
		
		vehicle.setUser(user);
		vehicle2.setUser(user);
		
//		user.setAddress("Rajka Jovanovic 5");
//		user.setJoinedDate(new Date());
//		user.setDescription("Seavus");
//		Adress addr = new Adress();
//		Adress addr2 = new Adress();
		
//		addr.setStreet("St5reet 1");
//		addr.setCity("KG");	
//		addr.setState("srb");
//		addr.setPincode(123);
//		
//		addr2.setStreet("Kopaonicka");
//		addr2.setCity("Bg");
//		addr2.setState("srb");
//		addr2.setPincode(123);
//		
//		user.getListOfAddress().add(addr);
//		user.getListOfAddress().add(addr2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.save(vehicle2);
		session.getTransaction().commit();
		session.close();
		
		//user = null;
		
		//session = sessionFactory.openSession();
		//session.beginTransaction();
		//user = (UserDetails) session.get(UserDetails.class, 1); //retrieving objects that we need (primary key is second arg)
		//session.close(); //cannot do lines under because session is closed! we have to put type EAGER 
		//System.out.println(user.getUserName());
		//System.out.println(user.getListOfAddress().size());
}

}
