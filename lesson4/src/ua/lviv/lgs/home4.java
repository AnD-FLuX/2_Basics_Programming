package ua.lviv.lgs;

public class home4 {
	public static void main(String[] args) {
		double a, b, c;

		a = 5.5;
		b = 11.5;
		c = 10;

		if (a < c & b > c) {
			System.out.println("��� � ���� �����: " + a + " �� " + b + " � ������� �� " + c);
			if (c - a > b - c) {
				System.out.println("����� " + b + " � ������� �� ����� " + c);
			} else if (c - a < b - c) {
				System.out.println("����� " + a + " � ������� �� ����� " + c);
			} else if (c - a == b - c) {
				{
					System.out.println("����� " + a + " �� " + b + " � �������� �� " + c);
				}
			}
		} else {
			System.out.println("������ ����� ����� ��� �������");
		}
	}
}