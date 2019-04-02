package tasks;

import java.io.PrintStream;

public class SalaryMethod {
    private static void salary(double salary, double hours) {
        if (hours > 60) {
            hours = 60;
        }
        if (hours > 40) {
            hours = 40 + (hours - 40) * 1.5;
        }
 
        if (salary > 5) {
            salary = 5;
        }
        System.out.println((String.format("salary: %.2f hours: % .0f  result: %.2f", salary, hours, (salary * hours))));
 
    }
 
 
    public static void main(String[] args) {
 
        salary(12, 10);
        salary(4, 24);
        salary(42, 75);
 
    }
}

