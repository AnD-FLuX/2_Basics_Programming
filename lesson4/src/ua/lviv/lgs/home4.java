package ua.lviv.lgs;

public class home4 {
	public static void main(String[] args) {
		double a, b, c;

		a = 5.5;
		b = 11.5;
		c = 10;

		if (a < c & b > c) {
			System.out.println("Яке з двох чисел: " + a + " та " + b + " є ближчим до " + c);
			if (c - a > b - c) {
				System.out.println("Число " + b + " є ближчим до числа " + c);
			} else if (c - a < b - c) {
				System.out.println("Число " + a + " є ближчим до числа " + c);
			} else if (c - a == b - c) {
				{
					System.out.println("Числа " + a + " та " + b + " є одинакові до " + c);
				}
			}
		} else {
			System.out.println("Невірно задані числа для зрівнянь");
		}
	}
}