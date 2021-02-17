package com.example.libraryWithAuthors;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
//@DiscriminatorValue("Bike") only for Single table strategy
public class TwoWheeler extends Vehicle {
	
	private String SteeringHandle;
	

}
