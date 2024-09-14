 package OOP_Interface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

// FortisHospital only have one parent class(HospitalMgmt), 
//they will not able to extend other class then again diamond problem will occur

public class FortisHospital extends HospitalMgmt implements USMedical, UKMedical, IndianMedical {


	// if a class is implementing interface then all the methods of interface should
	// be define in the class
	private String name;
	private String city;

	// no need to written all the methods of interface just curser over class and
	// they give options and click on it.
	
	// USMedical
	@Override
	public void physioServices() {
		// its class method now you can provide business logics acc to your business
		// needs
		System.out.println("FH -- physioServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");

	}

	@Override
	public void gynecServices() {
		System.out.println("FH -- gynecServices");

	}

	// common method -- it is in US and India
	// Bl- in case US call 911, india call 100 like this we can define for both
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");

	}

	// UK
	@Override
	public void ENTServices() {
		System.out.println("FH -- ENTServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");
	}

	// India
	@Override
	public void radiologyServices() {
		System.out.println("FH -- radiologyServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");

	}

	// fortis hospital:
	public void medicalInsurance() {
		System.out.println("FH -- medicalInsurance");
	}

	public void medicalTraining() {
		System.out.println("FH -- medicalTraining");
	}

	// method hiding --- US have this static method-- we can't override
	public static void billing() {
		System.out.println("FH - billing");
	}

	@Override
	public void getVaccine() {
		System.out.println("FH -- vaccination");
	}

	// WHO
	@Override
	public void covidTest() {
		System.out.println("FH -- Covid Test");
	}

	@Override
	public int test(int a) {
		return 100;
	}

}