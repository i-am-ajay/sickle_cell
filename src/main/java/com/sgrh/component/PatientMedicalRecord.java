package com.sgrh.component;

public class PatientMedicalRecord {
	private String consent;
	private String assent;
	private String hospitalName;
	private String registrationNo;
	private String icmrId;
	private String referred;
	private String diagnosis;
	
	public String getConsent() {
		return consent;
	}
	public void setConsent(String consent) {
		this.consent = consent;
	}
	public String getAssent() {
		return assent;
	}
	public void setAssent(String assent) {
		this.assent = assent;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getIcmrId() {
		return icmrId;
	}
	public void setIcmrId(String icmrId) {
		this.icmrId = icmrId;
	}
	public String getReferred() {
		return referred;
	}
	public void setReferred(String referred) {
		this.referred = referred;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
}
