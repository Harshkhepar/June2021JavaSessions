 package javasessions;

public class FunctionsInJava {

	//functions -- are also class data members
	
		//1.can not create a function inside a function
		//2.functions can not be duplicate
		//3.to call the function - we need to create the Object
	    //4. function can only return one value: we can't use multiple return in one function
	    //5. return statement should be the last statement in your function
		
		//three types of functions:
		
		//1. no input and no return:
		//void: no return from the function
		//return type: void
		public void test() {//0 input param
			System.out.println("test method....");
		}
		
		//2. no input and some return:
		//return type: String
		public String getTrainerName() {
			System.out.println("get trainer name....");
			String name = "Naveen";
			return name;
		}

		public int getPopulationCount() {
			System.out.println("get pop count..");
			int india = 100;
			int US = 50;
			int finalCount = india + US;
			return finalCount;
		}
		
		//3. some input and some return:
		//return type: int
		public int add(int a, int b) {
			System.out.println("add method");
			int z = a+b;
			return z;
		}
		
		//WAF - where we have to pass the student name(String) -- ip parameter
		//return - student marks (int)
		
		public int getStudentMarks(String name) {
			System.out.println("getting student marks for : " + name);
			int marks = -1;
			if(name.equals("sachin")) {
				marks = 90;
			}
			else if(name.equals("nancy")) {
				marks = 95;
			}
			else if(name.equals("bhumika")) {
				marks = 100;
			}
			else {
				System.out.println("student name : " + name + " is not found....");
			}
			return marks;
		}
		
		
		public static void main(String[] args) {
			FunctionsInJava obj = new FunctionsInJava();
			obj.test();
			String n = obj.getTrainerName();
			System.out.println(n);
			
			System.out.println(obj.getTrainerName());
			
			int pop = obj.getPopulationCount();
			System.out.println(pop);
			
			int sum = obj.add(10, 20);
			System.out.println(sum);
			
			int sum1 = obj.add(100, 105);
			System.out.println(sum1);
			
			int m1 = obj.getStudentMarks("naveen");
			System.out.println(m1);
			if(m1==-1) {
				System.out.println("this student is not in our school...");
			}
			
			int m2 = obj.getStudentMarks("bhumika");
			System.out.println(m2);
			
			int m3 = obj.getStudentMarks("Tom");
			System.out.println(m3);
			
			String mesg = obj.launchBrowser("chrome");
			System.out.println(mesg);
			
			String opb = obj.startBrowser("safari");
			System.out.println(opb);
			
			String l = obj.launchISLV("abdulKalam");
			System.out.println(l);
			
			
		}
		
		//WAF - where I need to pass the browserName(String) with if-else logic
	    //return the same browser name with a messg: "chrome is started"
		public String startBrowser(String brow)
		{
			System.out.println("started browser is"+ brow);
			if(brow.equals("chrome")) {
				System.out.println("chrome is started");
				return brow +" " + "is found and opened";
			}
			else if(brow.equals("firefox")){
				System.out.println("firefox is started");
				return brow+ " " + "is found and opened";
			}
			else
			{
				System.out.println("try to start wrong browser");
				return brow+ " "+"NOTFOUND --400 status";
			}
			 
		}
		
		
		
		//WAF - where I need to pass the browserName(String)
		//return the same browser name with a messg: "chrome is launched"
		public String launchBrowser(String browserName) {
			System.out.println("browser name is : " + browserName);
			
			switch (browserName) {
			case "chrome":
				return browserName+" is launched - 200OK";
			case "firefox":
				return browserName+" is launched";
			case "safari":
				return browserName+" is launched";

			default:
				System.out.println("please pass the right browser name.....");
				return "BROWSERNOTFOUND --- 404 ERROR";
				
			}
			
		}
		
		public String launchISLV (String launchingPadName) {
			System.out.println("Rocket is launched from :"+" "+ launchingPadName);
			
			switch(launchingPadName) {
			case "sriharikota":
				return launchingPadName + "launched the rocket in space";
				
			case "abdulKalam":
				return launchingPadName + "launched the rocket in space";
				
			case "pokhran":
				return launchingPadName + "launched the rocket in space";
				
			default:
				return launchingPadName + "is not found";
			}
			
		}
		
		
}
