package ua.lviv.lgs;

public class ApplicationSwitch {
	public static void main(String[] args) {

		int a = 42;

		switch (a) {
		case 12: {
			System.out.println("12");
			break;
		}
		case 22: {
			System.out.println("22");
			break;
		}
		case 42: {
			System.out.println("42");
			break;
		}
		default:
			System.out.println("default");
			break;

		}

	}
}
