package tasks;

import java.util.Scanner;

public class NumberOfDays {
	public static void main(String[] args) {
	System.out.println("������� ���-�� ����: ");
    int days=new Scanner(System.in).nextInt();

    convert(days);

}
static void convert(int days){
if(days<=0) throw new IllegalArgumentException();
System.out.println("� "+ days+" ����: "+ days*24 + " ����, "+ days*1440 +" �����, "+ days*86400+" ������.");

}
}
