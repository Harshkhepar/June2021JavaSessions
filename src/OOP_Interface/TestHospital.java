package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();   
		
		fh.cardioServices();
		fh.physioServices();
		fh.oncologyServices();
		fh.emergencyServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		USMedical.billing();// to call static method of interface--interfaceName.methodName
		FortisHospital.billing();
		fh.getVaccine();// fortis hospital method will be called 
		// USMedical.min_fee = 100;--- this is not allowed bcoz in Interface it is defined as 10 so its final and constant
		System.out.println(USMedical.min_fee);
		fh.medicalRD();
		fh.medicalPatientData();
		fh.covidFunds();
		
		
		//top casting: child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		// WebDriver driver = new chromedriver();
		// only access US methods--- reference check
		// with us reference var you can't access UK and India methods
		us.cardioServices();
		us.emergencyServices();
		us.gynecServices();
		us.physioServices();
		
		//Note : 	down casting: not allowed bcoz we have to create the object of parent interface 
		// (object createion for Interface not alllowed)
		
		
		
		UKMedical uk = new FortisHospital();
		uk.emergencyServices();
		
		

		
		
	}

}
