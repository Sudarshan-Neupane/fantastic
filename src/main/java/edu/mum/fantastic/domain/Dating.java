package edu.mum.fantastic.domain;

import java.io.Serializable;

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
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import edu.mum.fantastic.domain.Profile.Gender;

/**
 *
 * @author sudarshan
 */
@Entity(name = "dating")
public class Dating implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "interested_on")
    private Gender interestedOn;
    @NotNull
    @Enumerated(EnumType.STRING)
    private InterestedAge interestedAge;
    @NotEmpty
    private String description;
    @Valid
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    public Dating() {

    }

    public Dating(Gender interestedOn, User user, InterestedAge insAge) {
        this.interestedOn = interestedOn;
        this.user = user;
        this.interestedAge = insAge;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Gender getInterestedOn() {
        return interestedOn;
    }

    public void setInterestedOn(Gender interestedOn) {
        this.interestedOn = interestedOn;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public InterestedAge getInterestedAge() {
        return interestedAge;
    }

    public void setInterestedAge(InterestedAge interestedAge) {
        this.interestedAge = interestedAge;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public enum InterestedAge {

        TEENAGE,
        YOUNG_AUDULT,
        AUDULT,
        MIDDLE_AGE,
    }

}
