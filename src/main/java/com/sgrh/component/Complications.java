package com.sgrh.component;

public class Complications {
	private boolean painFulCrisis;
	private int crisisRequiringHospitalization;
	private int crisisInLast12Months;
	private boolean acuteChestSyndrom;	
	private boolean o2Support;
	private String O2SupportType;
	private boolean exchangeTransfusion;
	private boolean hydroxyurea;
	private boolean hyperHemolyticCrisis;
	private int numOfPainCrisisBeforeHydroxyUrea;
	private int numOfPainCrisisAfterHydroxyUrea;
	
	// Neurological
	private boolean neurologicalAbnormalities;
	// previous true then
	private boolean stroke;
	private boolean neuroimaging;
	private boolean ct;
	private String ctDetails;
	private boolean mri;
	private String mriDetails;
	
	private boolean recBloodTransfusion;
	private boolean recExchangeTransfusion;
	private double hbsLevel;
	private boolean seizures;
	private boolean cognitiveDysfunction;
	private boolean anyOtherDeficits;
	
	// doppler
	private boolean transactionalDoppler;
	private boolean ischemicAttack;
	private boolean neuropathicPain;
	private boolean otherNeurologicalAbnormalities;
	private String neurologicalAbnormalitiesDetails;
	
	// renal
	private boolean renalInvolvement;
	private String renalInvolvementType;
	private boolean urineProtein;
	private boolean bloodUrea;
	private boolean serumCreatnine;
	private boolean serumalbumin;
	private boolean dialysis;
	private boolean aceInhibitors;
	private boolean swelling;
	private boolean legUlcer;
	private boolean hepatobillaryInvolvement;
	// previous true then
	private boolean gallstone;
	// previous true then
	private boolean cholecystectomy;
	private double sBilirubinTotal;
	private double sBilirubinDirect;
	
	private boolean hepatitisBAntigen; // P or N
	private boolean antiHAV; 
	private boolean antiHCV;
	private boolean hepaticEncephalopathy;
	
	private boolean priapism;
	// privious true then
	private boolean managedAtHome;
	private boolean managedAtHospital;
	private boolean intracavernosalAspiration;
	private boolean alphaAgonist;
	private boolean exchangeTranfusion;
	private boolean surgicalShunt;
	private boolean erectileDysfunction;
	private double resolutionOfPriapism;
	// next section
	private boolean splenicCusis;
	// previous true then
	private boolean splBloodTransfusion;
	
	// next section
	private boolean aplasticCusis;
	// previous true then
	private boolean aplBloodTransfusion;
	
	// next section
	private boolean cardiacInvolvement;
	// previous true then
	private boolean cardiomegaly;
	private boolean leftVentricular;
	private boolean pulmonaryHypertension;
	private boolean decreasedLVEF;
	private String lvefType;
	
	// next section
	private boolean eyeInvolvement;
	// previous true then
	private boolean sickleRetinopathy;
	private boolean neovascularization;
	private boolean vitreousHemorrphage;
	private boolean retinalDetachment;
	private boolean retinalBreaks;
	// next section
	private boolean ironOverloaded;
	// previous true then
	private String ironOverloadedType;
	// next section
	private boolean historyOfInfection;
	// previous true then
	private boolean hospitalAddmission;
	private boolean bloodCulture;
	// previous true then
	private boolean bloodCulturePosOrNeg;
	// previous true then
	private String organism;
	
	// Vaccination
	private boolean vaccination;
	// previous true then
	private boolean hibVaccine;
	private boolean pheumococcalVaccine;
	private boolean meningococcalVaccine;
	private boolean typhoidVaccine;
	private boolean fluVaccine;
	private String typeOfInfection;
}
