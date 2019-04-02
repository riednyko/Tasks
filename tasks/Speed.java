package tasks;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    double d = 0.0;
    double t = 0.0;
    System.out.print("¬ведите рассто€ние (км): ");
    d=scanner.nextDouble();
    System.out.println();
    System.out.print("¬ведите врем€ (часы): ");
    t=scanner.nextDouble();
    System.out.printf("—корость, с которой нужно ехать%8.2f ",d/t);
    System.out.println(" км/ч");
}
}