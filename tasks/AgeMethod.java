package tasks;

import java.util.Scanner;

public class AgeMethod {
	void age(int a) {
		if (a < 30)
			System.out.println("Молодой");
		if (a > 30 && a < 60)
			System.out.println("Средний возраст");
		if (a >= 60)
			System.out.println("Пожилой");
	}
}
