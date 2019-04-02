package tasks;


public class Alphabet {
	public static void main(String[] args) {
		int a = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
			if (++a % 5 == 0) System.out.println();
		}
	}
}
