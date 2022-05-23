package com.zensar.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="attendance")
	public class Attendance {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String attendanceStatus;
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getAttendanceStatus() {
	return attendanceStatus;
	}
	public void setAttendanceStatus(String attendanceStatus) {
	this.attendanceStatus = attendanceStatus;
	}
	public Attendance(int id, String name, String attendanceStatus) {
	super();
	this.id = id;
	this.name = name;
	this.attendanceStatus = attendanceStatus;
	}
	public Attendance() {
	super();
	}


	}

