package ua.lviv.lgs;

public class home5 {
	public static void main(String[] args) {

		int k = 20;
		int minNumb = 0;
		int maxNumb = 1000;

		int max = 0;
		int min = maxNumb;

		int[] numbers = new int[k];

		System.out.println("�������� ����� � ������� " + k + " �����, �� " + minNumb + " �� " + maxNumb + ":");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = minNumb + (int) (Math.random() * maxNumb);
			System.out.println(numbers[i]);
		}

		for (int i = 0; i < numbers.length - 1; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("����������� ����� � ����� - " + max); 

		for (int i = 0; i < numbers.length - 1; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println("̳������� ����� � ����� - " + min);
	}

}
