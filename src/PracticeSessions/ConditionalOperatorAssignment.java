package PracticeSessions;

public class ConditionalOperatorAssignment {

	public static void main(String[] args) {
//		1. Take three numbers from the user and print the greatest number. 
//
//		Test Data
//		Input the 1st number: 25 
//		Input the 2nd number: 78 
//		Input the 3rd number: 87
//		Expected Output :
//		The greatest: 87

            int a = 25;
            int b = 78;
            int c = 87;
            if(a>b && b>c)
            {
            	System.out.println("a is the greatest");
            }
            else if(b>c)
            {
            	System.out.println("b is the greatest");
            }
            else {
            	System.out.println("c is the greatest"+": "+ c);
            }
            
	} 

}
