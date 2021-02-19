package ua.lviv.lgs;

public class PracticAlgoritm {
	public static void main(String[] args) {

		int a = 1;
		int b = 4;
		int c = 2;
		int d = b * b - 4 * a * c;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		if (a == 0) {
			System.out.println("a<>0");
		} else if (d < 0) {
			System.out.println("Рівняння дійсних коренів немає");
		} else if (d == 0) {
			System.out.println("x=" + (-b | 2 * a));
		} else if (d > 0) {
			System.out.println("x1=" + (-b + Math.sqrt(d)) / 2 * a);
			System.out.println("x2=" + (-b - Math.sqrt(d)) / 2 * a);
		}

	}

}
