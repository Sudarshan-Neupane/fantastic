package edu.mum.fantastic.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Size;

@Entity
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long profile_id;

	@Valid
	private Gender gender;
	@Size(min = 8)
	private String phoneNumber;

	private Date dateOfBirth;
	@Valid
	@OneToOne
	@JoinColumn(name="address_id")
	private Address address;

	public Profile(Gender gender, String phoneNumber,
			Date dob, Address address) {
		super();
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dob;
		this.address = address;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dob) {
		this.dateOfBirth = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public enum Gender {
		FEMALE, MALE
	}

	public enum Category {

		SPORT("Sport", ""), WATCHINGMOVIE("Watching movie", ""), READINGBOOK(
				"Reading Book", ""), TRAVEL("Travel", "");

		private String value;
		private String desc;

		private Category(String value, String desc) {
			this.value = value;
			this.desc = desc;

		}

		public String getValue() {
			return value;
		}

		public String getDesc() {
			return desc;
		}


	}

}
