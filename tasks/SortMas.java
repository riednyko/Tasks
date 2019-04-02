package tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortMas {
	public static void main(String[] args) {
		final Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("¬ведите длинну массива:");
		int x = sc.nextInt();
		int[] mas = new int[x];
		for (int i = 0; i < 10; i++) {
			mas[i]=(random.nextInt(100));
		}
		Arrays.sort(mas);
		for (int i = 0; i < 10; i++) {
			System.out.println(mas[i]);
		}
	}
}
