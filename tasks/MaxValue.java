package tasks;

import java.util.Scanner;

public class MaxValue {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("������� ������ �����:");
	int a = sc.nextInt();
	System.out.print("������� ������ �����:");
	int b = sc.nextInt();
	if(a>b) {
		System.out.println(a);
	}else {
		System.out.println(b);
	}
}
}
