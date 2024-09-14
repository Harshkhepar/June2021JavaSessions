 package ExceptionHandling;
// error -- rare -- could be becoz of your system exp. stackoverflowerror,Ram is full
// exception -- common--bcoz of your code

public class TryCatchBlock {
	String name = "naveen";

	public static void main(String[] args) {

		int a = 10;
	//	int b = 0;
		int b = 2;
		
		// niche k 2 points tab h jab b=0 ka case hai
		//System.out.println(a/b);//Arithmetic Exception --> runtime --also called unchecked exception 
		
		//Thread.sleep(3000); --> Thread is class---compile time --also called checked exception-- here Thread ne compile time 
		// pr he dekhlea k above line mai exception hai 
		
		// when b=0 
		// try {
//		        System.out.println(a/b);
//	        }
//	       catch(ArithmeticException e) {
//		        System.out.println("AE exception is coming....");
//		        e.printStackTrace();// exactly tells you in which line exception is coming	
//          }
//		System.out.println("Bye");
//		System.out.println("Bye");
//		System.out.println("Bye");
//		System.out.println("Bye");
		
		
		try {
			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			System.out.println(obj.name);//NPE
			System.out.println("hiii");
			System.out.println(a/b);
			System.out.println("hello");
			System.out.println("hello");
			System.out.println("hello");
		}
		catch(ArithmeticException e) {
			System.out.println("AE exception is coming....");
			e.printStackTrace();// exactly tells you in which line exception is coming	
		}
		//1. see we can handle multiple exception by writing below lines but it is not a right practice
//		catch(Exception e) {
//			System.out.println("AE exception is coming....");
//		}
		//2. with one single try{} we can have multiple catch{}
		//3. for different exceptions you have to catch in different catch blocks.
		catch(NullPointerException e) {
			System.out.println("NPE exception is coming....");
			e.printStackTrace();
		}
		
		
		
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");

		
	}

}