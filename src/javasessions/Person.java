package javasessions;

public class Person {

	//static methods:
		
		public void getName() {
			System.out.println("get name");
		}
		
		public static void sendMail() {
			System.out.println("send mail");
		}
		

		public static void main(String[] args) {

			Person p = new Person();
			p.getName();
			
			//how to call static methods:
			//1. call by class name:
			Person.sendMail();
			
			//2. direct calling:
			sendMail();
			
			//3. call by object ref name: with a warning
			p.sendMail();
			
		}
		// Ques : why main method is static in nature?
		// Ans  : so we don't have to create the object
		// stored in CMA.JVM calls the main method. 
		// Main mehod is stored in CMA or meta space

}
