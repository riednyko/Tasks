package tasks;

import java.util.Scanner;

public class ExchangeRate {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Введите текущий курс:");
    	double usd = sc.nextDouble();
    	System.out.print("Введите количество рублей:");
    	double rub = sc.nextDouble();
    	System.out.println("По текущему курсу - " + rub + " рублей" + " = " + rub/usd + " долларов");
    }
}
