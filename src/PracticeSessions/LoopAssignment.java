package PracticeSessions;

public class LoopAssignment {

	public static void main(String[] args) {
//		1. WAP to print following output:
//			I am Batman -- 5 timnes
       
		for(int i=1;i<=5;i++) {
			System.out.println("I am Batman");
		}
		
//		2. WAP to print following output:
//			I am Batman 1,2,3,4,5,6,7,8,9
		System.out.println("============================================");
		for(int j=1;j<=9;j++)
		{
			System.out.println("I am Batman"+" "+ j);
		}
		System.out.println("============================================");
//		3. WAP to print 10 to 1 using for, while and do-while loop
		int k=10;
		while(k>=1)
		{
			System.out.println(k);
			k--;
		}
		System.out.println("++++++++++++++++++++++++++++");
		for(int q=10;q>=1;q--) {
			System.out.println(q);
		}
		System.out.println("----------------------------");
		int h = 10;
		do {
			System.out.println(h);//1
			h--;
		}
		while(h>=1);
		
		System.out.println("=========assignment4================");
		int p= 1;
		while(p<=10) {
			
			System.out.println("Hello World");
			p++;
		}
		System.out.println("================ assignment 5============");
		// 5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		int l=1;
		while(l<=10) {
			System.out.println(l);
			if(l*1 == 7) {
				System.out.println("breaking the loop");
				break;
			}
			l++;
		}
	}

}
