package com.myuberproject.entities;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "uber_driver")
public class UberDriver 
	{

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id")
		private Integer id;
		
		@Column(name = "FirstName")
		private String firstName;
		 
		@Column(name = "LastName")
		private String lastname;
		
		@Column(name = "Email")
		private String email;
		
		@Column(name = "PhoneNumber")
		private int phoneNumber;
		
		@Column(name = "DrivingLicence")
		private String drivingLicence;
		
		@Column(name = "SSN")
		private int ssn;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getDrivingLicence() {
			return drivingLicence;
		}

		public void setDrivingLicence(String drivingLicence) {
			this.drivingLicence = drivingLicence;
		}

		public int getSsn() {
			return ssn;
		}

		public void setSsn(int ssn) {
			this.ssn = ssn;
		}

		
	}
