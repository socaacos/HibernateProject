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
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.Data;

@Entity
@Data
@Table(name = "UserInfo")
@org.hibernate.annotations.Entity(selectBeforeUpdate = true)
@NamedQuery(name="UserDetails.byId", query = "from UserDetails where id = ?")
//@NamedNativeQuery(name="UserDetails.byName", query = "select * from userinfro where username = ?", resultClass = UserDetails.class)
public class UserDetails {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String userName;

}
