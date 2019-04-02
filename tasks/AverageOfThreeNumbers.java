package tasks;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("¬ведите первое число:");
    	int n1 = sc.nextInt();
    	System.out.print("¬ведите второе число:");
    	int n2 = sc.nextInt();
    	System.out.print("¬ведите третье число:");
    	int n3 = sc.nextInt();
    	System.out.println("—реднее арифметическое чисел = " + (n1+n2+n3)/3);
    }
}
