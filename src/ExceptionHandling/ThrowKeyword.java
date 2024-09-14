package ExceptionHandling;

public class ThrowKeyword 
   // The purpose of the throw keyword is when we deliberately wants to generate exception in that case we use throw
    {

	public static void main(String[] args) {
		
		String data = null;// suppose this data is coming from external source(like excel sheet)
		
		if(data==null) {
			try {
				throw new Exception("NODATAFOUNDEXCEPTION");// this line will throw exception so that 
				                                            //we have to use try catch to handle the exception
				// new Exception (object of Exception class) : this is the way to throw exception by putting throw keyword
			}
			catch(Exception e) {
				System.out.println("data is null....");
				e.printStackTrace();// tell you the details
			}		}
		
		
		
	}

}