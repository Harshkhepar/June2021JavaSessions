package javasessions;

import java.util.ArrayList;

public class ArrowTeam {
  
	String employee;
	String scrumTeam;
	ArrayList<String> deviceList;
	
	public ArrowTeam(String employee, String scrumTeam) {
		this.employee = employee;
		this.scrumTeam = scrumTeam;
	}

	public ArrowTeam(String employee, String scrumTeam, ArrayList<String> deviceList) {
		this.employee = employee;
		this.scrumTeam = scrumTeam;
		this.deviceList = deviceList;
	}
	
	public void getEmpDetail() {
		System.out.println(employee + " " + scrumTeam + " " + deviceList);
	}
	
}
