package javasessions;

public class ArrayConcept {

	public static void main(String[] args) {
		//Array: collection of multiple elements (similar types)
		//two limitations: 
		//1. static array: size is fixed...to overcome this problem we use dynamic arrays (ArrayList)
		//2. it stores only similar types of values: to overcome this problem we use Object Array (object array is static in nature)
		// exp of static array - used for weeks, months, no. of students in class
		
		//int array:
		
		int i[] = new int[4]; 
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[4]=60;//ArrayIndexOutOfBoundsException
		//LI = 0 (LI- lowest index)
		//Hi = 3 (Hi -Highest Index)
		//Len = Hi + 1 ==> 4 (len - length of an array)
		//Hi = Len-1 = 3
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		System.out.println(i[1]+i[2]);
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		// i cannot beyond highest index in static array
		
		int len = i.length;
		// "i.length" give you the length of the array
		
		System.out.println("--------");
		//to print all the values of array (to iterate the array): using for loop:
		for(int k=0; k<len; k++) {
			System.out.println(i[k]);
		}
		System.out.println("--------");

		//for each loop:
		// for ([what type of array it is][declare any variable ]:[what is your array name])
		for(int e : i) {
			System.out.println(e);
		}
		
		System.out.println("--------");

		
		
		
		//double array:
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 23.44;
		
		//char array:
		char c[] = new char[3];
		c[0] = 'a';
		c[1]='$';
		c[2]='4';
		
		//String array:
		String lang[] = new String[3];
		lang[0] = "Java";
		lang[1] = "Python";
		lang[2] = "JS";
		
		for(int s=0; s<lang.length; s++) {
			System.out.println(lang[s]);
		}
		
		//for each:
		for(String e : lang) {
			System.out.println(e);
		}
		
		//store emp info: String, int, double, char, boolean
		//Object Array: static array:
		// Object is the super class of all the classes
		Object ob[] = new Object[5];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 34.44;
		ob[3] = 'm';
		ob[4] = true;
		
		for(int t=0; t<ob.length; t++) {
			System.out.println(t + ":" + ob[t]);
		}
		
		
		for(Object e : ob) {
			System.out.println(e);
		}

	}

}
