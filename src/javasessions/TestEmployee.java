package javasessions;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {

		EmployeeInfo e1 = new EmployeeInfo("Tom", 20);
		System.out.println(e1.age + " " + "of"+ " "+e1.name);
		System.out.println(e1.devicesList);// null -- default value of arraylist is null
		
		ArrayList<String> devList = new ArrayList<String>();// we have to create the object of ArrayList
		devList.add("Iphone12");//add is a method in ArrayList
		devList.add("iMac");
		devList.add("Samsung s8");

		EmployeeInfo e2 = new EmployeeInfo("Shalini", 25, devList);
		
		System.out.println(e2.name + " " + e2.age + " " + e2.devicesList);
		
		
		
		
	}


}
