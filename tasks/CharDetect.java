package tasks;

import java.util.Scanner;

public class CharDetect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������");
        String str = sc.next();
        char c = str.charAt(0);
        if (Character.isDigit(c)) System.out.println("��� �����");
        if (Character.isLetter(c)) System.out.println("��� �����");
        if (".,:;".contains(str)) System.out.println("��� ����������");
    }
}
