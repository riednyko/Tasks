package tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinMaxArray {
	public static void main(String[] args) {
		Random random = new Random();
		int mas[] = new int[10];

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			mas[i] = (random.nextInt(100));
		}

		int min, max, minn = 0, maxn = 0;
		min = max = mas[0];

		Arrays.sort(mas);
		for (int i = 0; i < 10; i++) {
			if (mas[i] < min) {
				min = mas[i];
				minn = i;
			}
			if (mas[i] > max) {
				max = mas[i];
				maxn = i;
			}
		}
		System.out.println("Минимальный элемент массива   = " + min + " Это " + minn + " Элемент массива");
		System.out.println("Максимальный элемент массива = " + max + " Это " + maxn + " Элемент массива");
	}
}
