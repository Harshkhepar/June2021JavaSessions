  package javasessions;

public class IfElseConcept {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println(a == b);// equals equals operator return boolean

		if (a == b)
		{
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}

		if (true) // after if in brackets() always there is a boolean value
		{
			System.out.println("PASS");
		} else {// dead code i.e it will never execute
			System.out.println("FAIL");
		}

		boolean flag = true;
		if (flag) {
			System.out.println("hiii");
		} else {
			System.out.println("bye...");
		}

		String s = "selenium";

		if (s.equals("selenium")) // with Strings we used "equals" not "=="
		{
			System.out.println("I learn selenium...");
		}
		if (s.equals("cypress")) {
			System.out.println("I learn cypress...");
		}

		String browser = "chrome";
		// this is not right way of writing the code
		// bcoz jvm runs in all 'if' despite of getting  their true condn in first line
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		if (browser.equals("firefox")) {
			System.out.println("launch ff");
		}
		if (browser.equals("safari")) {
			System.out.println("launch safari");
		}
		if (browser.equals("edge")) {
			System.out.println("launch edge");
		} else {
			System.out.println("browser not found....");
		}

		// String browser = "chrome";
		// This is also not the right way
		// bcoz here if we want to launch edge then also JVM go through all the "else if" to find out
		
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("launch ff");
		} else if (browser.equals("safari")) {
			System.out.println("launch safari");
		} else if (browser.equals("edge")) {
			System.out.println("launch edge");
		} else {
			System.out.println("browser not found....");
		}
        
		// switch-case:
		// String browser = "edge";
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "edge":
			System.out.println("launch edge");
			break;

		default:
			System.out.println("please pass the correct browser.....");
			break;
		}

		int marks = 10;

		switch (marks) {
		case 1:
			System.out.println("case 1");
			break;
		case 10:
			System.out.println("case 10");
			break;
		case 100:
			System.out.println("case 100");
			break;

		default:
			break;
		}

		//>=90 -- Grade A, 
		//71 - 90 ---> grade B
		//50 to 70--> grade C
		//less 50 -- Fail
		
		int m = 90;
		if (m<=100) {
			if(m>=90) {
				System.out.println("Grade A");
			}
			if(m>70 && m<=90) {
				System.out.println("Grade B");
			}
			if(m>=50 && m<=70) {
				System.out.println("Grade C");
			}
			if(m<50) {
				System.out.println("Fail");
			}
		}
		else {
			System.out.println("incorrent number");
		}
		
		
		
//		int m = 70;
//		if (m <= 100) {
//			if (m >= 90) {
//				System.out.println("Grade A");
//			}
//		}
//		else {
//			System.out.println("incorrect marks");
//		}

		//WAP to find out the highest number out of three diff numbers:
		int x = 500;
		int y = 800;
		int z = 300;
		//&& -> short circuit operator
		if(x>y && x>z) {//false && true = false
			System.out.println("x is the highest");
		}
		else if(y>z) {//false
			System.out.println("y is the highest");
		}
		else {
			System.out.println("z is the highest");
		}
		
		//&& || 
		String s1 = "Linux";
		if(s1.equals("Win") || s1.equals("Mac") || s1.equals("Linux")) {
			System.out.println("OS is running....");
		}
//		if(s1.equals("Win") && s1.equals("Mac") && s1.equals("Linux")) { // short circuit the condition
//			System.out.println("OS is running....");
//		}
		
		// "!" reverse the condition
		String user = "admin";
		if(!user.equals("admin")) {
			System.out.println("login with admin....");
		}
		else {
			System.out.println("login with normal user");
		}
		
		String text = " ";
		System.out.println(text.isEmpty());// String text = "";// isEmpty() gives you boolean
		System.out.println(text.isBlank());//String text = " ";// isBlank() gives you boolean
		
		if(!text.isBlank()) {
			System.out.println("text link is found....");
		}
		
		int i = 'a';//97
		char c = 'b';//98
		System.out.println(c);//b
		System.out.println(i+c);//195
		
		System.out.println('a'+'b');//195 -- two chars will give you ascii value
		System.out.println('a'+""+'b'); // this behaves like character -->ab
		System.out.println(97+""+'b');

		System.out.println(c++);
		System.out.println(c);
		
		int v = 2;
		System.out.println(v++ + ++v);//2+4 = 6

	}

}
