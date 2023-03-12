package org.launchcode.codingevents.models;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
//@EnableAutoConfiguration
public class Event {

    @Id
    @GeneratedValue
    private int id;

    @Size(min = 3, max = 50, message = "name should be between 3 and 50 characters")
    @NotBlank(message = "name is required")
    private String name;

    @Size(max = 500, message = "Description too long")
    private String description;

    @Email(message = "Invalid email. Try again.")
    @NotBlank(message = "email is required")
    private String contactEmail;

    private EventType type;

    @NotBlank(message="Location cannot be left blank")
    private String address;

    @NotBlank(message="City cannot be left blank")
    private String city;

    private State state;

    @NotBlank(message = "Must include zip code")
    @Size(max=5, min=5, message = "zip code to only be 5 digits long")
    private String zipCode;

    @AssertTrue(message = "can't have people just showing up to stuff, please have them register")
    private Boolean register;

    public Event(String name,
                 String description,
                 String contactEmail,
                 EventType type,
                 String address,
                 String city,
                 State state,
                 String zipCode,
                 Boolean register) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.register = register;
    }

    public Event(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Boolean getRegister() {
        return register;
    }

    public void setRegister(Boolean register) {
        this.register = register;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
