package tasks;

import java.util.Scanner;

public class MaxValue {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("¬ведите первое число:");
	int a = sc.nextInt();
	System.out.print("¬ведите второе число:");
	int b = sc.nextInt();
	if(a>b) {
		System.out.println(a);
	}else {
		System.out.println(b);
	}
}
}
