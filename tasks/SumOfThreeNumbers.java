package tasks;

import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("������� ������ �����:");
    	int n1 = sc.nextInt();
    	n1 = n1*2;
    	System.out.print("������� ������ �����:");
    	int n2 = sc.nextInt();
    	n2 = n2-3;
    	System.out.print("������� ������ �����:");
    	int n3 = sc.nextInt();
    	n3 = n3*n3;
    	System.out.println("����� ����� = " + n1+n2+n3);
    }
}
