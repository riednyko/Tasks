package tasks;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("������� ������ �����:");
    	int n1 = sc.nextInt();
    	System.out.print("������� ������ �����:");
    	int n2 = sc.nextInt();
    	System.out.print("������� ������ �����:");
    	int n3 = sc.nextInt();
    	System.out.println("������� �������������� ����� = " + (n1+n2+n3)/3);
    }
}
