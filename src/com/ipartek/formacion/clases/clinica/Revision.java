package com.ipartek.formacion.clases.clinica;

public class Revision extends Pet {
	
	private String date;
	private int id;
	private String reason;
	private String diagnosis;
	private String treatment;
	
	
	public Revision() {
		super();
		this.date = "00/00/0000";
		this.id = 0;
		this.reason = "unknown";
		this.diagnosis = "unknown";
		this.treatment = "unknown";
	}

	public Revision(String name, String species, String race, int age, String date, int id, String reason, String diagnosis, String treatment) {
		super(name, species, race, age);
		this.date = date;
		this.id = id;
		this.reason = reason;
		this.diagnosis = diagnosis;
		this.treatment = treatment;
	}
	
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	
	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	
	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	@Override
	public String toString() {
		return "Revision Date=" + date + ", ID=" + id + ", Reason=" + reason + ", Diagnosis=" + diagnosis
				+ ", Treatment=" + treatment;
	}
}