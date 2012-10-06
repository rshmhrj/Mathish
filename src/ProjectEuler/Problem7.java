package ProjectEuler;
import java.util.Scanner;

public class Problem7 {
	
	/**
	 * @param args
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
	 * we can see that the 6th prime is 13.
	 * 
	 * What is the 10,001st prime number?
	 * 10001
	 */
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will find the specified x-th prime number.");
		System.out.println("Please enter a value for x:");
		int num = input.nextInt();
		long start = System.currentTimeMillis();
		input.close();
		
		int[] primeList = generatePrimeList(num);
		
		System.out.println("The "+num+"-th prime is "+primeList[primeList.length-1]);
		
		long end = System.currentTimeMillis();
		int time = (int)(end - start);
		System.out.println("****The Program took "+time+"ms to execute.****");
		System.out.println("End of Program.");
	} // end method main
	
	public static int[] generatePrimeList(int num){
		int[] primeList = new int[num];		
		int pCount = 1;
		primeList[0] = 2;
		
			for (int i=3; pCount < num; i = i+2){
				if(isPrime(i)){
					primeList[pCount] = i;
					pCount = pCount+1;
				} // end if
			} // end for
		return primeList;
	}
	
	public static boolean isPrime(int num){
		double root = Math.sqrt(num);
		
		for (int i=2; i<root+1; i++){
			if (num%i == 0 && num != i){
				return false;
			}
		}
		return true;
	}

} // end class ProblemTemplate