 package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		//1 to 10:
				//1. while:
				
				int i = 1;
				while(i<=10) {
					System.out.println(i);//1 2 3 4.....10 
					//i++;
					//++i;
					i=i+1;
				}
				
				//practical use cases: 
				//have to use when we are not sure about how many iterations are there...
				//1. we have to do lazy loading..linkedin, FB scrolling -- suppose we have to get harsh post
				//2. timeout operations: waiting for a webelement
				//3. handling multiple windows: window handler APIs: how many pop ups?
				
				int n = 1;
				while(n<=50) {
					System.out.println(n);
						if(n % 5 == 0) {
							System.out.println("Hi....");
						}
					n++;	
				}
				
				System.out.println("-----while with break----------");
				
				int score = 50;
				while(score<=100) {
					System.out.println(score);
					if(score == 50) {
						System.out.println("half century");
					}
					
					if(score == 100) {
						System.out.println("century");
					}
					
					if(score == 0) {
						System.out.println("duck...out");
						break;
					}
					score++;
				}
				
				System.out.println("-------");
				
				//for loop: 1 to 10:
				
				for(int k=1; k<=10; ) { //init, conditional, incremental/decr
					System.out.println(k);//1 2 3 4 ...10
					k++;
				}
				
				//
//				for(;;) // condn always true {
//					System.out.println("Bye....");
//				}
				System.out.println("-------");

				//even numbers : 0 2 4 6 8 10....
				for(int even = 0; even<=10; ) {
					System.out.println(even);
					//even=even+2;
					even+=2;
				}
				for(int odd = 1; odd<=10; ) {
					System.out.println(odd);
					//even=even+2;
					odd=odd+2;
				}
				
				System.out.println("-------");

				//even numbers with %2==0
				
				
				for(int evn=0;evn<=20;) {
					if(evn%2==0) {
						System.out.println(evn);
					}
					evn=evn+2;
				}
				
				System.out.println("-------");
                  ////odd number with %2!=0
				
				for(int odd = 1; odd<=20; ) {
					if(odd%2 !=0) {
					System.out.println(odd);
					}
					
					odd=odd+2;
				}
				
				
				
				
				//use cases:
				//we are sure about how many iterations we have to perform....
				//1. you have to iterate array, arraylist, collections which order based or sequence vise
				//2. total links on the page: you have to print the text of all links
				//3. footer/top links
				//4. ArrayList -- 10 links---> out of 10 link i have to click on product link
				//click on product link: if(text.equals("product") --> click and break
				
				System.out.println("--------");
				//for with if:
				int p = 1;
				for(;p<=10;p++) {
					System.out.println(p);
					if(p==2) {
						System.out.println("Hello....");
						break;
					}
				}
				
				//infinite loop: use case:
				//Taj Hotel--display--welcome to taj -- 24x7:
//				while(true) {
//					System.out.println("welcome to taj....");
//				}
				
//				while(true) {
//					//check the element is displayed or not...
//					//once its displayed -- break the loop
//					//thread.sleep(2);
//					//max time out = 20 secs --break;
//				}
				System.out.println("---------");
				
				//do-while loop:
				//webelement--> at least check this webelement on the page immediately...
				//if first time its available on the page....break the loop
				
				//land on the web page:
				//check if page is fully loaded...do loop
				//then WE ---while();
				int h = 1;
				do {   // statement is in do loop
					System.out.println(h);//1
					h++;
				}
				while(h<=10);// conditional statement
				// while does not have any body
				while(h>=10);
				
				//for each
				//streams -- JDK 1.8: a. sequence b. parallel --- use cases in selenium
				
				
				
				

	}

}
