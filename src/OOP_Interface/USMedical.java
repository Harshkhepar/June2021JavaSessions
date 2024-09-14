package OOP_Interface;

public interface USMedical extends WHO{
	
	int min_fee = 10;
	// Interface variables(not methods) are static and final by default
	
	//1. no method body
	//2. abstract method: has no method body
	//3. method prototype : only method declaration
	//4. can not create the object of interface
	//5. we can't create the constructor of interface bcoz there is no object of interface 
	//   and constructor is called by object
	// 6. An Interface cannot have a parent class

	public void physioServices();// by default abstract
//	public static void physioServices();-- we can't override static methods
	public void cardioServices();

	public void emergencyServices();
	
	public void gynecServices();
	
	public int test(int a);
	
	@Override
	public void covidTest();

	
	//after jdk 1.8:
	//1. can have method body with static method but we can't override this methods in my child class
	public static void billing() {
		System.out.println("US - billing");
	}
	
	//2. default method:with method body --- not used in practical cases(waste method)
	// this method can be overriden by class(fortis hospital) but here business logic is given by US Interface
	default void getVaccine() {
		System.out.println("US -- vaccination");
	}
	
	

}




