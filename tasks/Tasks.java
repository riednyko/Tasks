package tasks;

import java.util.Scanner;

public class Tasks {
	public static void main(String[] args) {
		AgeMethod Task1 = new AgeMethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите возраст");
		int a = sc.nextInt();
		Task1.age(a);
	}
}
