package com.apandiyan.enquiry;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "enquiry")
public class Enquiry {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private String additionalPhone;
	private String attender;
	private String relationshipWithAttender;
	private String address;
	private String city;
	private String state;
	private String country;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdditionalPhone() {
		return additionalPhone;
	}
	public void setAdditionalPhone(String additionalPhone) {
		this.additionalPhone = additionalPhone;
	}
	public String getAttender() {
		return attender;
	}
	public void setAttender(String attender) {
		this.attender = attender;
	}
	public String getRelationshipWithAttender() {
		return relationshipWithAttender;
	}
	public void setRelationshipWithAttender(String relationshipWithAttender) {
		this.relationshipWithAttender = relationshipWithAttender;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
