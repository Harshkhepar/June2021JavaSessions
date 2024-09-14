package javasessions;

import java.util.ArrayList;
 
public class ArrowTest {

	public static void main(String[] args) {
		 
		ArrowTeam a = new ArrowTeam("Harsh","Automation");
	    System.out.println(a.employee + " in the team of "+ a.scrumTeam +" "+ "having" + " "+ a.deviceList);
	    
	    ArrayList<String> hardwareList = new ArrayList<String>();
	    
	    hardwareList.add("macbookPro");
	    hardwareList.add("iphone");
	    hardwareList.add("windowslaptop");
	    
	    ArrowTeam a1 = new ArrowTeam("Harsh","Automation",hardwareList);
	    System.out.println(a1.employee + " in the team of "+ a1.scrumTeam +" "+ "having" + " "+ a1.deviceList);
	}

}
