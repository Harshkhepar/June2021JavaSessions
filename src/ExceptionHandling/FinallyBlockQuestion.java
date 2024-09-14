package ExceptionHandling;

public class FinallyBlockQuestion {

	public static int getMarks(String name) {
		
//		if (name.equals("Dev")) {
//			return 100;
//			} else if (name.equals("sonia")) {
//		return 90;
//	}

//	return -1;
		

		if (name.equals("Dev")) {
			try {
				int cal = 10 / 0;
				
			} catch (ArithmeticException e) {
				System.out.println("some exception is coming....");
				return -2;
			}
			finally 
			// exception is coming or not but finally will always executed.
			{
				System.out.println("hi im in finally block");
				return -3;
			}// two returns are not possible so -3 will be return which is in finally block
			//  finally bloc return will override the catch block return or main returns
		} else if (name.equals("sonia")) {
			return 90;
		}

		return -1;

	}
	public static void main(String[] args) {

		int m1 = getMarks("Dev"); //(calling static method)
		System.out.println(m1); // finally block value will come always 
		// return of finally block will overcome the main return
		// here we get at console:  hi im in finally block
		                          // -3
	}

}
