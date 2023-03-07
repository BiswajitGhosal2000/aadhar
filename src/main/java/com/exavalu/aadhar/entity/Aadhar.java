package com.exavalu.aadhar.entity;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "aadhar")
public class Aadhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long aadharNo;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String guardianName;

	@Column(nullable = false)
	private String gender;

	public long getAadharNo() {
		return aadharNo;
	}
	
	@Column(nullable = false)
	private Date dob;

	@Column(nullable = false)
	private String village;


	@Column(nullable = false)
	private String postOffice;
	
	@Column(nullable = false)
	private String district;
	
	@Column(nullable = false)
	private String state;
	
	@Column(nullable = false)
	private String pinCode;

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
}
