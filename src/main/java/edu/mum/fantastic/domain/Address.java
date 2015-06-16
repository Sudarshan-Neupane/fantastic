package edu.mum.fantastic.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Address implements Serializable {
	 private static final long serialVersionUID = 1L;
	 
	 @Id
	 private long id;
	 
	 @NotEmpty
	 private String address1;
	 
	 private String address2;
	 @NotEmpty
	 private String city;
	 @NotEmpty
	 private String state;
	 @NotEmpty
	 private String zipCode;
	 
	 
	public Address(String address1, String address2, String city, String state,
			String zipCode) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	 
	 

}
