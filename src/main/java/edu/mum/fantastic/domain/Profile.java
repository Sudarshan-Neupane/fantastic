package edu.mum.fantastic.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity(name = "profiles")
public class Profile implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Valid
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "phone_id")
    private Phone phone;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
//    @NotNull
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Hobbies.class, fetch = FetchType.EAGER)
//    @JoinTable(name = "tblInterests", joinColumns = @JoinColumn(name = "id"))
//    @Column(name = "interest", nullable = false)
    @OrderColumn(name = "hobbies")
    private Set<Hobbies> hobbies;
    @Valid
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public Profile() {
    }

    public Profile(Gender gender, Phone phoneNumber,
            Date dob, Address address) {
        super();
        this.gender = gender;
        this.phone = phoneNumber;
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

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
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

    public Set<Hobbies> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<Hobbies> hobbies) {
        this.hobbies = hobbies;
    }

    public enum Gender {

        MALE, FEMALE, OTHER
    }

    public enum Hobbies {

        SPORTS("Sports", ""), WATCHINGMOVIE("Watching movie", ""), READINGBOOK(
                "Reading Book", ""), TRAVEL("Travel", ""), READING("Reading", "");

        private String value;
        private String desc;

        private Hobbies(String value, String desc) {
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
