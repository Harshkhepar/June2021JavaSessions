package OOP_Encapsulation;

public class BeboConnect {

	private void isVaccinationDone() {
		System.out.println("vaccination of employee is done");
	}
	
	private void fineHealth() {
		System.out.println("health of employee is fine");
	}
	
	private void readguideLines() {
		System.out.println("Employee read all the guidelines");
	}
	
	public void openBeboConnect() {
		System.out.println("Employee Attendance login");
		 isVaccinationDone();
		 fineHealth();
		 readguideLines();
		 
		System.out.println("Employee is eligible to come to office ");
		 
	}
	
}
