package tasks;

import java.util.Scanner;

public class Сomparison {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите первое число:");
		int a = sc.nextInt();
		System.out.print("Введите второе число:");
		int b = sc.nextInt();
		if(a-b==100&&b-a==100) {
			System.out.println("Да");
		}else {
			System.out.println("Нет");
		}
	}
}
