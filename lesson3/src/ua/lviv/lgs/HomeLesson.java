package ua.lviv.lgs;

public class HomeLesson {
	public static void main(String[] args) {

		String a = "Понеділок";

		switch (a) {
		case "Понеділок": {
			System.out.println("Розпорядок дня на понеділок:");
			System.out.println("– сніданок");
			System.out.println("– прийом вітамінів");
			System.out.println("– чищення зубів");
			break;
		}
		case "Вівторок": {
			System.out.println("Розпорядок дня на вівторок:");
			System.out.println("– сонячні ванни");
			System.out.println("– вирішення найбільш важливих завдань");
			System.out.println("– заняття спортом");
			break;
		}
		case "Середа": {
			System.out.println("Розпорядок дня на середа:");
			System.out.println("– обід");
			System.out.println("– заняття спортом");
			System.out.println("– прогулянка");
			break;
		}
		case "Четвер": {
			System.out.println("Розпорядок дня на четвер:");
			System.out.println("– заняття спортом");
			System.out.println("– заняття спортом");
			System.out.println("– вечеря");
			break;
		}
		case "Пятниця": {
			System.out.println("Розпорядок дня на пятниця:");
			System.out.println("– вирішення найбільш важливих завдань");
			System.out.println("– обід");
			System.out.println("– прогулянка");
			break;
		}
		case "Субота": {
			System.out.println("Розпорядок дня на субота:");
			System.out.println("– прийом вітамінів");
			System.out.println("– прогулянка");
			System.out.println("– підготовка до сну");
			break;
		}
		case "Неділя": {
			System.out.println("Розпорядок дня на неділя:");
			System.out.println("– сонячні ванни");
			System.out.println("– прогулянка");
			System.out.println("– підготовка до сну");
			break;
		}
		default:
			System.out.println("Немає такого дня тижня");
			break;

		}

	}
}
