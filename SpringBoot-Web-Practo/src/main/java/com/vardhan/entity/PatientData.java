package com.vardhan.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "Patients")
public class PatientData implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "PatientName", columnDefinition = "varchar(50)")
	private String name;
	@Column(unique = true)
	private long phoneNumber;
	private String password;
	private String gender;
	private int age;
	private String appointmentDate;
	private String specialist;
	@CreationTimestamp
	@Column(name = "registeredDate")
	private Timestamp createdDate;
	@UpdateTimestamp
	private Timestamp modifiedDate;
	@Version
	private int version;

	public PatientData() {

	}

	public PatientData(String name, long phoneNumber, String password, String gender, int age, String appointmentDate,
			String specialist) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.appointmentDate = appointmentDate;
		this.specialist = specialist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "PatientData [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", password=" + password
				+ ", gender=" + gender + ", age=" + age + ", appointmentDate=" + appointmentDate + ", specialist="
				+ specialist + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + ", version="
				+ version + "]";
	}

}
