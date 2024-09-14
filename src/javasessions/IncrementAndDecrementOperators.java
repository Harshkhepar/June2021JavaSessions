package javasessions;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		//++ --> increase the value by 1

				int a = 1;
				int b = a++;//post increment
				
				System.out.println(a);//2
				System.out.println(b);//1
				
				int m = -99;
				int n = m++;
				System.out.println(m);//-98
				System.out.println(n);//-99
				
				int c = 1;
				int d = ++c;//pre increment
				System.out.println(c);//2
				System.out.println(d);//2
				
				int f = -97;
				int g = ++f;
				System.out.println(f);//-96
				System.out.println(g);//-96
				
				int t = 1;
				System.out.println(t++);//1 -- bcoz inside the memory it take only the orignal value first 
                              		//		and stop there bcoz t value is now they already get
				System.out.println(t);//2
				
				//post decreemnt: --
				int p = 2;
				int q = p--;
				System.out.println(p);//1
				System.out.println(q);//2
				
				int h = -999;
				int i = h--;
				System.out.println(h);//-1000
				System.out.println(i);//-999
				
				//pre decrement:
				int s1 = 2;
				int s2 = --s1;
				System.out.println(s1);//1
				System.out.println(s2);//1
				
				System.out.println("========================================");
				int v = 1;
				System.out.println(++v + v++);//4
				System.out.println(v);//3
				
				int mm = 1;
				//System.out.println(mm++);
				System.out.println(mm++ + 4);
				System.out.println(mm);
				
				
				int x = 10;
				int y = 10/2;
				System.out.println(y);
				System.out.println(10/2);
				System.out.println(9/2);//4 -- bcoz pure integer value
				System.out.println(9.0/2);//4.5 -- bcoz double value
				System.out.println(9/2.0);//4.5
				System.out.println(9.0/2.0);//4.5
				
				System.out.println(0/9);//0
				//System.out.println(9/0);// give us exception in the thread --Arithmetic exception
				System.out.println(1/1);
				//System.out.println(0/0);// give us exception in the thread --Arithmetic exception
				// "0" is not for division in case of integer
				System.out.println(9.0/0);//Infinity- In case of double "0" divisible is allowed
				System.out.println(0.0/0.0);// NaN - not a number
				System.out.println(0/0.0);// NaN - not a number
				System.out.println(9/0.0);// Infinity
				
				System.out.println(9 % 3);// reminder is "0"
				System.out.println(10 % 3);// 1

	}

}
