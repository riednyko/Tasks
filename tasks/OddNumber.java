package tasks;

public class OddNumber {

	public static void main(String[] args) {
		int[][] a = new int[12][10];
		int s = 1;
		int x = 0;
		int y = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				y = 2 * j + 1;
				a[i][j] = y + x;
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			 x += y + 1;
		}
	}
}
