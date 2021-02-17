package com.example.libraryWithAuthors;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
//moze a ne mora, ako ne stavimo bice default SingleTable
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name="Vehicle_Type", discriminatorType = DiscriminatorType.STRING) only for Single table strategy
public class Vehicle {
	@Id
	@GeneratedValue
	private int Vehicleid;
	private String vehicleName;
	
	
}
