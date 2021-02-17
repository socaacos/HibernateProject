package com.example.libraryWithAuthors;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
//@DiscriminatorValue("Car") only for Single table strategy

public class FourWheeler extends Vehicle {

	private String SteeringWheel;

}
