package math;

import java.util.ArrayList;

public class Maths {

	public static int randomBetween(int x, int y){
		int diff = y - x;
		if (diff < 0){
			diff *= -1;
		}
		double random = Math.random();
		int z = (int)Math.round(random*diff);
		return z;
	}
	
	public static int[] twoRandoms(int x, int y){
		int a = randomBetween(x,y);
		int b = randomBetween(x,y);
		while (a == b){
			b = randomBetween(x,y);
		}
		int[] result = {a,b};
		return result;
	}
	
	public static int gcd (int x, int y){
		if (x == y) return x;
		
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		int z = max - min;
		return gcd(min,z);
	}
	
	public static int[] extendedGCD(int a, int b){
		int[] result = {0,1};
		if ( b == 0 ) return result;
		else{
			int q = a/b;
			int r = a%b;
			
			int[] st = new int[2];
			st = extendedGCD(b,r);
			
			int s = st[0];
			int t = st[1];
			
			result[0] = t;
			result[1] = s - q * t;
			return result;
		}
	}
//	function extended_gcd(a, b)
//    if b = 0
//        return (1, 0)
//    else
//        (q, r) := divide (a, b)
//        (s, t) := extended_gcd(b, r)
//        return (t, s - q * t)
	
	public static ArrayList<Integer> findInvertibleElements(int[] Z){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int i = 1; i < Z.length-1; i++){
			if (gcd(Z[i],Z.length-1) == 1){
				result.add(Z[i]);
			}
		}
		
		return result;
	}
	
	public static boolean isPalindrome(String str){
		boolean palindrome = new StringBuilder(str).reverse().toString().equals(str);
		return palindrome;
	}
	
	public static boolean isPalindrome(int x){
		StringBuffer temp = new StringBuffer();
		temp.append(x);
		String forward = temp.toString();
		temp = temp.reverse();
		String backward = temp.toString();
		if (forward.equals(backward)) return true;
		else return false;
	}
	
	public static boolean isPrime(int val){
		double sqrt = Math.sqrt(val);

		for(int div=2; div<= sqrt+1; div++){
			if(val%div == 0){
				return false;
			}
		}
		return true;
	}
	
	public static ArrayList<Integer> generatePrimeFactors(long num){		
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		double root = Math.sqrt(num)+1;
		
		// initialize all prime factors in the list to false
		for(int i=2; i <= root+1; i++){
			if(num%i == 0 && isPrime(i)){
				primeFactors.add(i);
			}
		}

		return primeFactors;
	}
}
