package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {

		int a = 2;
		char b = 'r';
		double c = 2.14;
		boolean d = true;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		int personAge = 26;

//	
//	if(personAge >= 25) {
//		System.out.println("Person alcoholic");
//	} else {
//		System.out.println("Person non alcoholic");
//	}

		if (personAge >= 25) {
			System.out.println("Person alcoholic");
		} else if (personAge >= 21 && personAge < 25) {
			System.out.println("Person can smoke");
		} else {
			System.out.println("Person non alcoholic");
		}

		// +=
		
		int valueA = 2;
		valueA+=5;
		System.out.println(valueA); // 5+2=7
		
		// ділення з остачею --- %
		
		System.out.println("17 % 3 = "+17%3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
