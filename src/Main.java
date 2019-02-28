import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a program that reads in a dollar amount for the cost of an item
		 * Read in a second amount for how much was paid
		 * Print out how to break it into change
		 * How many 100s,50s,20s,10s,5s,toonies,loonies,quarters,dimes,nickels.
		 * If it does not end in a 5 or 0, you must round the number appropriately.
		 * If the payment doesn't cover the cost, output the amount still owing.
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("How much is the cost?");
		double cost=in.nextDouble();
		System.out.println("How much was paid?");
		double payment=in.nextDouble();
		//TODO: Here is where your code goes
		double change=payment-cost;
		int num100s; 
		int num50s;
		int num20s;
		int num10s;
		int num5s;
		int num2s;
		int num1s;
		double quarters;
		double dimes;
		double nickels;
		//How many 100 dollar bills?
		System.out.println("Your change is "+change);
		num100s=(int)(change/100);
		change=change%100;
		if (num100s>0) {
			System.out.println(num100s+" x $100");
		}
		//how many 50 dollar bills
		num50s=(int)(change/50);
		change=change%50;
		if (num50s>0) {
		System.out.println(num50s+" x $50");
		}
		//how many 20 dollar bills
		num20s=(int)(change/20);
		change=change%20;
		if (num20s>0) {
		System.out.println(num20s+" x $20");
		}
		//how many ten dollar bills
		num10s=(int)(change/10);
		change=change%10;
		if (num10s>0) {
		System.out.println(num10s+" x $10");
		}
		//how many five dollar bills 
		num5s=(int)(change/5);
		change=change%5;
		if (num5s>0) {
		System.out.println(num5s+" x $5");
		}
		//how many toonies
		num2s=(int)(change/2);
		change=change%2;
		if (num2s>0) {
		System.out.println(num2s+" x $2");
		}
		//how many loonies
		num1s=(int)(change/1);
		change=change%1;
		if (num1s>0) {
		System.out.println(num1s+" x $1");
		}
		//how many quarters
		quarters=(int)(change/0.25);
		change=change%0.25;
		if (quarters>0) {
		System.out.println(quarters+" x $0.25");
		}
		//how many dimes
		dimes=(int)(change/0.10);
		change=change%0.10;
		if (dimes>0) {
		System.out.println(dimes+" x $0.10");
		}
		//how many nickels
		nickels=(int)(change/0.05);
		change=change%0.05;
		if (nickels>0) {

		}
		if (change >=0.03) {
			nickels=nickels+1;
		}
		System.out.println(nickels+" x $0.05"); 
	}
}
		
		
	


