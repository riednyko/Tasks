package tasks;

import java.util.Scanner;

public class AgeMethod {
	void age(int a) {
		if (a < 30)
			System.out.println("�������");
		if (a > 30 && a < 60)
			System.out.println("������� �������");
		if (a >= 60)
			System.out.println("�������");
	}
}
