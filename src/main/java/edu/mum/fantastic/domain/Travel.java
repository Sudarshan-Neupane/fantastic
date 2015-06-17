package edu.mum.fantastic.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity(name="travel")
public class Travel implements Serializable {
	private static final long serialVersionUID = 1L;

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotEmpty
	private String destination;
	@NotNull
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dateFrom;
	@NotNull
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date dateTo;
	@NotEmpty
	private String description;

	public Travel() {

	}

	public Travel(String destination,Date dateFrom,Date dateTo,String description){
		this.destination = destination;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
