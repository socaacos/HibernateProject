package com.example.libraryWithAuthors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "UserInfo")
public class UserDetails {
	
	@Id
	@GeneratedValue
	private int userId;
	
	private String userName;
//	@OneToOne
//	@JoinColumn(name="VIHICLE_ID")
	@OneToMany
	@JoinTable(name= "User_Vehicle", joinColumns = @JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID"))
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	
	
	
//	@ElementCollection(fetch = FetchType.EAGER)
//	@JoinTable(name="USER_ADDRESS",
//				joinColumns = @JoinColumn(name = "USER_ID"))
//	@GenericGenerator(name="hilo-gen", strategy = "hilo")
//	@CollectionId(columns = {@Column(name="ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type = "long") )
//	private Collection<Adress> listOfAddress = new ArrayList<Adress>();
	
//	@Embedded
//	@AttributeOverrides({
//	@AttributeOverride (name = "street", column = @Column (name = "HOME_STREET_NAME")),
//	@AttributeOverride (name = "pincode", column = @Column (name = "HOME_PINCODE_NAME")),
//	@AttributeOverride (name = "city", column = @Column (name = "HOME_CITY_NAME")),
//	@AttributeOverride (name = "state", column = @Column (name = "HOME_STATE_NAME"))
//	})
//	private Adress homeAddress;
//	
//	public Adress getHomeAddress() {
//		return homeAddress;
//	}
//	public void setHomeAddress(Adress homeAddress) {
//		this.homeAddress = homeAddress;
//	}
//	public Adress getOfficeAddress() {
//		return officeAddress;
//	}
//	public void setOfficeAddress(Adress officeAddress) {
//		this.officeAddress = officeAddress;
//	}
//	@Embedded
//	private Adress officeAddress;
	
//	@Temporal(TemporalType.DATE)
//	private Date JoinedDate;
//	
//	private String address;
//	
//	@Lob
//	private String description;
	
	

//	public Vehicle getVihicle() {
//		return vihicle;
//	}
//	public void setVihicle(Vehicle vihicle) {
//		this.vihicle = vihicle;
//	}
	//	public Date getJoinedDate() {
//		return JoinedDate;
//	}
//	public void setJoinedDate(Date joinedDate) {
//		JoinedDate = joinedDate;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
	public int getUserId() {
		return userId;
	}
public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	//public Collection<Adress> getListOfAddress() {
//		return listOfAddress;
//	}
//	public void setListOfAddress(Collection<Adress> listOfAddress) {
//		this.listOfAddress = listOfAddress;
//	}
	//	public Adress getAddress() {
//		return homeAddress;
//	}
//	public void setAddress(Adress address) {
//		this.homeAddress = address;
//	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
