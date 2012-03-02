
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CallingMethod method = new CallingMethod();
		System.out.println("Addition: " + method.add(30,15));
		System.out.println("Subtraction: " + method.subtract(30,15));
		System.out.println("Multiplication: " + method.multiply(30,15));
		System.out.println("Division: " + method.division(30,15));
		System.out.println("Modulus: " + method.modulus(30,15));
		}

}
