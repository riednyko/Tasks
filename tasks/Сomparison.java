package tasks;

import java.util.Scanner;

public class �omparison {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ������ �����:");
		int a = sc.nextInt();
		System.out.print("������� ������ �����:");
		int b = sc.nextInt();
		if(a-b==100&&b-a==100) {
			System.out.println("��");
		}else {
			System.out.println("���");
		}
	}
}
