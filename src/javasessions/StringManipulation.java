 package javasessions;


public class StringManipulation {

	public static void main(String[] args) {

		String s = "Hi this is my java code and i am so happy"; // this is an array
		
		System.out.println(s.length());// size of array
                                       // we use "s.size" for arraylist no bracket
		
		int l = s.length();//41
		int hi = l-1;//40
		int li = 0;
		 
		System.out.println(s.charAt(4));// "rv.charAt(i)" value at specific index
		System.out.println(s.charAt(40));
		//System.out.println(s.charAt(41));//StringIndexOutOfBoundsException
		//System.out.println(s.charAt(-1));//StringIndexOutOfBoundsException
		System.out.println("-----");
		System.out.println(s.indexOf('i'));//1st occurrence of i -- giving you 1
		System.out.println(s.indexOf('i', s.indexOf('i')+1));//2nd occurrence of i
		
		System.out.println(s.indexOf('H'));// "rv.indexof" is used to get the index of specific character or string
		System.out.println(s.indexOf("java"));// 14--started from 14 position
		System.out.println(s.indexOf("naveen"));//-1 --famous interview question -- if nothing is found then java will give you -1
		
//		String mesg = "welcome admin";
		String mesg = "welcome null";
		if(mesg.indexOf("admin")>0) {
			System.out.println("admin user logged in");
		}
		else {
			System.out.println("user is null...");
		}
		
		String a1 = "this is my code";
		System.out.println(a1.toUpperCase());//rv.toUpperCase() is used to do uppercase all the string
		System.out.println(a1.toLowerCase());//rv.toLowerCase() is used to do lowercase all the string
		
		//contains:will give you boolean
		String header = "This is amazon page";
		System.out.println(header.contains("amazon"));// true
		
		//equals:gives boolean value
		//String literals: store in SCP
		String s1 = "naveen";// String constant pool(duplicate values are not allowed)
		String s2 = "naveen";// dekho string literals k case mai object ek he banega vo b SCP mai uss object ko s1 or s2 refer krre honge 
		                     // isliye s1==s2 di value true aaungi
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);//true here we are checking the references
		
		String n1 = "Naveen";
		System.out.println(s1.equals(n1));// equals check that both the values are equal -- here false
		System.out.println(s1.equalsIgnoreCase(n1));//true rv1.equalsIgnoreCase(rv2) now it ignore capital letter and small letters
		
		//String object with new keyword:
		String s3 = new String("test");// By creating the object of String 2 objects will be created one is store in heap and other in SCP 
		String s4 = new String("test");// By this line new object is created in heap but not inside SCP bcoz "test" value is already there
		// of 59 line object-- SCP does not allow duplicate value(Optimize the code by java)
		String n2 = new String("naveen");

		System.out.println(s3==s4);//false-- jab hum String objects bnaenge then alag alag object banenge heap memory mai 
		                           //unko alag alag rv's refer krenge isliye s3==s4 gives false
		System.out.println(s3.equals(s4));// true -- thats why always use .equals method in case of Strings
		
		System.out.println(s1==n2);//false -- s1 pointing "naveen" in SCP but n2 refering "naveen" in heap memory
		System.out.println(s1.equals(n2));// true -- here compairing the value so thats why true
		
		String t1 = "selenium";
//		t1 = "QTP naveen";// String is immutable(means cannot be changed) means here t1 is refering "QTP naveen" but selenium is there in SCP
		t1 = t1+ "QTP naveen";
		
		int m = 10;// these are mutable
		m = 20;// means now m is 20 and 10 is gone 	
		
		String t2 = "selenium";
		
		System.out.println(t2);// selenium
		System.out.println(t1);// seleniumQTP naveen
		System.out.println(m);

		//substring method:used to capture small string from long string
		String p1 = "this is selenium code";
		System.out.println(p1.substring(8));// here from 8 upto the entire value
		System.out.println(p1.substring(2, 8));// from 2 to 7(not included ending value) 
		
		//split method:Imp Method -- return String Array
		String str = "java_python_ruby_javascript";
		String strArr[] = str.split("_");// split on the basis of _ and it gives you stringarray
		System.out.println(strArr.length);
		System.out.println(strArr[0]);
		for(String e : strArr) {
			System.out.println(e);
		}
		
		//test data:
		String empReg = "ekta;kumar;ekta@gmail.com;9090;ekta@123";
		String empData[] = empReg.split(";");
		
		for(String e : empData) {
			System.out.println(e);
		}
		
		//
		String tr = "xXtestingXxXSeleniumXXxXpython";
		String test[] = tr.split("xX");
		System.out.println(test[0]);// blank
		System.out.println(test[1]);//testingX
		System.out.println(test[2]);//SeleniumXX
		System.out.println(test[3]);//python
		//System.out.println(test[4]);//ArrayIndexOutOfBoundsException

		String hr = "testing_selenium;test_seleniumPython;testing_selenium_ruby";
		System.out.println(hr.split(";")[0]);
		System.out.println(hr.split(";")[1]);

		
	}

}