package tasks;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    double d = 0.0;
    double t = 0.0;
    System.out.print("������� ���������� (��): ");
    d=scanner.nextDouble();
    System.out.println();
    System.out.print("������� ����� (����): ");
    t=scanner.nextDouble();
    System.out.printf("��������, � ������� ����� �����%8.2f ",d/t);
    System.out.println(" ��/�");
}
}