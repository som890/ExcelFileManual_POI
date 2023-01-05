package com.losom.excelfilepoi.ExcelFileTwo_POI;

public class Student {
	private Long id;
	private String name;
	private String email;
	private String studentCode;
	private float score;
	private String address;
	public Student() {}
	public Student(Long id, String name, String email, String studentCode, float score, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.studentCode = studentCode;
		this.score = score;
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", studentCode=" + studentCode + ", score="
				+ score + ", address=" + address + "]";
	}
	
}

