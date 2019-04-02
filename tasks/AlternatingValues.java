package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class AlternatingValues {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("¬ведите длину массива:");
	int n = sc.nextInt();
	  int[] a = new int[n];
	   for (int i = 0; i < n; i += 2) {
	        a[i] = 1;
	   }
	System.out.println(Arrays.toString(a));
}
}


