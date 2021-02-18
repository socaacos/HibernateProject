package com.example.libraryWithAuthors.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

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
		/*for(int i = 0; i<10; i++)
		{
			UserDetails user1 = new UserDetails();
			user1.setUserName("User" + i);
			session.save(user1);
		}*/
		String minRes = "5";
		String userName = "User4";
		
//		Query query = session.createQuery("from UserDetails where id > ? and userName = ? ");
		//Query q  = session.getNamedQuery("UserDetails.byId");
		
		//q.setInteger(0, Integer.parseInt(minRes));
//		query.setString(1, userName);
//		query.setFirstResult(12);
//		query.setMaxResults(5);
		//List<UserDetails> users = (List<UserDetails>) q.list();
		UserDetails userexample = new UserDetails();
		userexample.setUserName("User0");
		Example example = Example.create(userexample);
		
		Criteria criteria = session.createCriteria(UserDetails.class).add(example);
		//criteria.add(Restrictions.eq("userName", "User1"));
		
		List<UserDetails> users2 = (List<UserDetails>) criteria.list();
		session.getTransaction().commit();
		session.close();
		
		//System.out.println(users.size());
		
		for (UserDetails userDetails : users2) {
			System.out.println(userDetails);
		}
		
//		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(user);
//		UserDetails user1 = (UserDetails) session.get(UserDetails.class, 1);
//		session.getTransaction().commit();
//		session.close();
//		user1.setUserName("Updated");
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.update(user1);
//		session.getTransaction().commit();
//		session.close(); PERSISTANT TO DETACHED 
		
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
		
}

}
