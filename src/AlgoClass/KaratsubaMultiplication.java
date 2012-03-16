package AlgoClass;

import java.util.Scanner;

public class KaratsubaMultiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Karatsuba Multiplication Program.");
		System.out.println("Please enter the first integer:");
		int x = input.nextInt();
		System.out.println("Please enter the second integer:");
		int y = input.nextInt();
		
		System.out.println("Karatsuba Method = " + karatsuba(x,y));
		System.out.println("Normal Method = " + x*y);
		
		
		System.out.println("End of Program.");

	}

	public static int karatsuba(int x, int y){
		System.out.println(x + " * " + y + " = ");
		int n = (findLength(x));
		int a = splitFirst(x);
		int b = splitSecond(x,a);
		int c = splitFirst(y);
		int d = splitSecond(y,c);
		System.out.println("a = " + a + " and b = " + b);
		System.out.println("c = " + c + " and d = " + d);
		int product = (int) ((Math.pow(10, n) * karatsuba(a,c)) + (Math.pow(10,n/2) * (karatsuba(a,d) + karatsuba(b,c))));
		return product;
	}
	
	public static int splitFirst(int x){
		int a = (int) (x / findPower(findLength(x)));
		return a;
	}
	public static int splitSecond(int x, int a){
		int b = x - (int) (a * findPower(findLength(x)));
		return b;
	}
	public static int findLength(int x){
		int n = Integer.toString(x).length();
		return n;
	}
	public static int findPower(int n){
		int power = (int)(Math.pow(10, n/2));
		return power;
	}
	
}
