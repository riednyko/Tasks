package tasks;

import java.util.Scanner;

public class MaxLengthMas {
	public static void main(String[] args) {

		String mas[] = new String[5];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Введите следующую строку ");
			mas[i] = in.nextLine();
		}

		int max = mas[0].length();
		int maxi = 0;
		for (int i = 0; i < 5; i++) {
			if (mas[i].length() > max) {
				max = mas[i].length();
				maxi = i;
			}
		}

		System.out.println("Самое большое слово в массиве это " + mas[maxi] + " Оно состоит из " + max + " букв");
	}
}
