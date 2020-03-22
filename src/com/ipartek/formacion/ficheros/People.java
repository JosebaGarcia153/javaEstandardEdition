package com.ipartek.formacion.ficheros;


public class People {
	
	private String name;
	private String company;
	private String birthDate;
	private String phone;
	private String email;
	private String personalNumber;
	
	
	public People() {
		super();
		this.name = "name";
		this.company = "company";
		this.birthDate = "birth date";
		this.phone = "phone number";
		this.email = "email";
		this.personalNumber = "personal number";
	}
	
	
	public People(String name, String company, String birthDate, String phone, String email,
			String personalNumber) {
		super();
		this.name = name;
		this.company = company;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
		this.personalNumber = personalNumber;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}


	@Override
	public String toString() {
		return "Name=" + name + ", Company=" + company + ", BirthDate=" + birthDate + ", Phone=" + phone
				+ ", Email=" + email + ", PersonalNumber=" + personalNumber;
	}
}