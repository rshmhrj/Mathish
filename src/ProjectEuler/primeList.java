package ProjectEuler;
import java.util.Scanner;


public class primeList {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program is to test the time to generate primes using both nested 'fors' and separate methods.");
		System.out.println("Please enter the number of primes to find:");
		int num = input.nextInt();
		long startMethod = System.currentTimeMillis();
		System.out.println("****Begin Methods.****");
		
		int[] primeListMethod = generatePrimeList(num);
		
		for(int i=0; i<=primeListMethod.length-1; i++){
			System.out.println(primeListMethod[i]);
		}
		
		long endMethod = System.currentTimeMillis();
		int timeMethod = (int)(endMethod - startMethod);
		System.out.println("****End Methods.****");
		System.out.println("****Begin Fors.****");
		long startFors = System.currentTimeMillis();
		
		int[] primeListFors = new int[num];
		int pCount = 1;
		double root = Math.sqrt(num);
		primeListFors[0] = 2;
		
		for (int i=3; pCount<num; i=i+2){
			for (int j=2; j<root+1; j++){
				if(i%j == 0 && i != j){
					continue;
				}
			}
			primeListFors[pCount] = i;
			pCount = pCount + 1;	
		}
		
		for(int i=0; i<=primeListFors.length-1; i++){
			System.out.println(primeListFors[i]);
		}
		long endFors = System.currentTimeMillis();
		int timeFors = (int)(endFors - startFors);
		System.out.println("****End Fors.****");
		
		System.out.println("****The Program took "+timeMethod+"ms to execute using the Methods.****");
		System.out.println("****The Program took "+timeFors+"ms to execute using the nested Fors.****");
		System.out.println("End of Program.");
	}
	
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
	
}
