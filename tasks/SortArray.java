package tasks;

import java.util.Arrays;
import java.util.Random;

public class SortArray {
	public static void main(String[] args) {
		final Random random = new Random();
		
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
		    array[i] = (random.nextInt(100));
		}
	    Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
		    System.out.println(array[i]);
		}
	}
}
