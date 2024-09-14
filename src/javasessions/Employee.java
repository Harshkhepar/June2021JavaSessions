 package javasessions;

public class Employee {
	
	// class is an entity eg: human, now from human we can make n no. of human beings i.e object
	// object is a physical identity

	
		// class vars: global vars -- the purpose of the class variable is providing the template
	    // data member of a class
		String name; //null - default value
		int age; //0
		String dob; //null
		char gender; // " "
		double salary; //0.0
		

		public static void main(String[] args) {

			// String name; //local var
	        // 1. "object" is created inside the "heap memory" but "reference or reference variable" is created inside the "stack memory"
			Employee e1 = new Employee();
			
			e1.name = "Tom";
			e1.age = 25;
			e1.dob = "01-01-1990";
			e1.gender = 'm';
			e1.salary = 12.33;
			
			System.out.println(e1.name + " " + e1.age) ;
			
			Employee e2 = new Employee();
			System.out.println(e2.name);
			System.out.println(e2.age);
			
			Employee e3 = new Employee();
			e3.name = "Nancy";
			e3.age = 40;
			
			System.out.println(e3.name + " " + e3.age + " " + e3.dob + " " + e3.gender + " " + e3.salary);

			new Employee().name = "Dev";
			new Employee().age = 25;
			new Employee().dob = "01-01-1990";


			
			System.gc();// for garbage collector
			// 1.JVM monitor heap memory and sends instruction to garbage collector 
			// 2.gc enter inside the heap memory and start destroying those objects 
			//which do not have any references means remove anonymous object
			// 3.gc do not touch those objects which have references
			// 4.gc is designed only for the heap memory they will never come in stack memory
			
			
			

	}

}
