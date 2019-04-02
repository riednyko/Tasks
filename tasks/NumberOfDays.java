package tasks;

import java.util.Scanner;

public class NumberOfDays {
	public static void main(String[] args) {
	System.out.println("Введите кол-во дней: ");
    int days=new Scanner(System.in).nextInt();

    convert(days);

}
static void convert(int days){
if(days<=0) throw new IllegalArgumentException();
System.out.println("В "+ days+" днях: "+ days*24 + " часа, "+ days*1440 +" минут, "+ days*86400+" секунд.");

}
}
