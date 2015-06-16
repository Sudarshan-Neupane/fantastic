package edu.mum.fantastic.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import org.hibernate.annotations.CollectionId;

@Entity(name = "profiles")
public class Profile implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Valid
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Size(min = 8)
    @Column(name = "phone_number")
    private String phoneNumber;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Valid
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public Profile() {
    }

    public Profile(Gender gender, String phoneNumber,
            Date dob, Address address) {
        super();
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dob;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
