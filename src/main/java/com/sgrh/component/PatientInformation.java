package com.sgrh.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class PatientInformation {
	private String patientName;
	private String adharNumber;
	private String gender;
	private Relation father;
	private Relation Mother;
	private Address permanentAddress;
	private Contact patientContact;
	private SocioDemographic socioDemo;
	private Examination patientExamination;
	private Complications complications;
	private LabHematInvestigation hematInvestigation;
	private LabMolecularStudies molecularStudies;
	private BioChemicalTest bioChemicalTest;
	private TreatmentDetail treatmentDetails;
	private FinalDiagnosis finalDiagnosis;
}
