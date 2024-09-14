package ExceptionHandling;

public class FinallyBlock {
	String name = "SQL Server";

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		try {
			int z = a / b;
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally // used with try catch
		// Exception is coming or not but finally block will always executed.
		// finally block generally not use in selenium becoz try catch block is enough
		{
			System.out.println("I am in finally block");
		}
		 // Examples for finally block
		//1. Database connection:practical use case of finally block
		try {
			System.out.println("DB connection is stablished");
			FinallyBlock obj = new FinallyBlock();
			//obj = null;
			System.out.println(obj.name);
		}
		catch(NullPointerException e ) {
			System.out.println("SQL query is not correct");
			e.printStackTrace();
		}
		finally {
			// yahan pr DB disconnect krna ka code likhdo apna
			System.out.println("disconnect the DB");
		}
		
		//2. File Handling:
		//a. create the connection with excel sheet:
		//b. try to get the data
		//c. data is not found/null
		//d. some exception is coming
		//e. finally-> close the connection with excel (close/flush the connection)

	}

}