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
		long x = input.nextLong();
		System.out.println("Please enter the second integer:");
		long y = input.nextLong();
		
		System.out.println("Karatsuba Method = " + karatsuba(x,y));
		System.out.println("Normal Method = " + x*y);
		
		
		System.out.println("End of Program.");

	}

	public static long karatsuba(long x, long y){
		System.out.println(x + " * " + y + " = ");
		int n = (findLength(x));
		long z = 1;
		if (n <= 2){
			z = x*y;
			System.out.println(z);
			return z;
		}
		else{
			long a = splitFirst(x);
			long b = splitSecond(x,a);
			long c = splitFirst(y);
			long d = splitSecond(y,c);
			System.out.println("a = " + a + " and b = " + b);
			System.out.println("c = " + c + " and d = " + d);
			long ac = karatsuba(a,c);
			long bd = karatsuba(b,d);
			long adbc = (a+b)*(c+d)-ac-bd;
			z = (long) ((findPower(n,1) * ac) + (findPower(n,2) *(adbc) + bd));
			System.out.println(z);
			return z;
		}
	}
	
	public static long splitFirst(long x){
		long a = x / findPower(findLength(x),2);
		return a;
	}
	public static long splitSecond(long x, long a){
		long b = x - (int) (a * findPower(findLength(x),2));
		return b;
	}
	public static int findLength(long x){
		int n = Long.toString(x).length();
		return n;
	}
	public static long findPower(long n, int x){
		long power = (long)(Math.pow(10, n/x));
		return power;
	}
	
}
