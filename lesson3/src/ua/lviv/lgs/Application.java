package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {

		int sumNumbersValue = sumNubers(10, 20);
		System.out.println(sumNumbersValue);

		double substractNumbersValue = substractNumbers(30, 4);
		System.out.println(substractNumbersValue);
		
		multiply(sumNumbersValue, (int) substractNumbersValue);
		devide(sumNumbersValue, (int) substractNumbersValue);

	}

	static int sumNubers(int a, int b) {
		return a + b;
	}

	static double substractNumbers(int a, int b) {
		return a - b;
	}

	static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	static void devide(double a, double b) {
		double devide = a/b;
		System.out.println(devide);
	}

}
