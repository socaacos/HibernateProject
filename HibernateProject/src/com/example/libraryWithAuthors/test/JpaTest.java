package com.example.libraryWithAuthors.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.cfg.Configuration;

import com.example.libraryWithAuthors.UserDetails;
import com.example.libraryWithAuthors.Vehicle;

public class JpaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails user = new UserDetails();
		Vehicle vehicle = new Vehicle();
		Vehicle vehicle2 = new Vehicle();
		
		
		
		vehicle.setVehicleName("Car");
		vehicle2.setVehicleName("Jeep");
		
		user.setUserName("sofijaJakovljevic");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.persist(vehicle);

		entityManager.persist(vehicle2);

		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
