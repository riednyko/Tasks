package tasks;

import java.util.Scanner;

public class ExchangeRate {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("������� ������� ����:");
    	double usd = sc.nextDouble();
    	System.out.print("������� ���������� ������:");
    	double rub = sc.nextDouble();
    	System.out.println("�� �������� ����� - " + rub + " ������" + " = " + rub/usd + " ��������");
    }
}
