package OOP_Interface;

public class HospitalMgmt extends UNHG{
	
	public void medicalRD(){
		System.out.println("HospitalMgmt - medicalRD");
	}
	
	
	public final void medicalPatientData()// I don't want that fortis hospital will not allowed to override this data
	                                      //This "final" keyword doesn't allowed fortis hospital 
	                                      // to override this method
	{
		System.out.println("HospitalMgmt - medicalPatientData");
	}

}