package ua.lviv.lgs;

public class Home {


	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 1;
		int d = b * b - 4 * a * c;
		
		System.out.println("Обчислюємо квадрате рівняння a*x*x + b*x + c = 0, де ");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("----------------");
		
		if (a == 0) {
			System.out.println("a!=0 (a<>0)");
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
