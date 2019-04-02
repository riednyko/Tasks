package tasks;

import java.util.Scanner;

public class Square {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Введите сторону квадрата");
	int s1 = sc.nextInt();
	int P=s1*4, S=s1*s1;
	System.out.println("Площадь квадрата = " + S);
	System.out.println("Периметр квадрата = " + P);
}
}
