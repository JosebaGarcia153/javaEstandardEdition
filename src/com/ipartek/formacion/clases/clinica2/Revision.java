package com.ipartek.formacion.clases.clinica2;

public class Revision {
	
	private String date;
	private int doctorId;
	private String reason;
	private String diagnosis;
	private String treatment;
	
	
	public Revision() {
		super();
		this.date = "00/00/0000";
		this.doctorId = 0;
		this.reason = "unknown";
		this.diagnosis = "unknown";
		this.treatment = "unknown";
	}

	
	public Revision(String date, int doctorId, String reason, String diagnosis, String treatment) {
		super();
		this.date = date;
		this.doctorId = doctorId;
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

	
	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int id) {
		this.doctorId = id;
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
		return "Revision Date=" + date + ", Doctor ID=" + doctorId + ", Reason=" + reason + ", Diagnosis=" + diagnosis
				+ ", Treatment=" + treatment;
	}
}