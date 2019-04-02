package tasks;

public class ChangeoOfVariables {
	public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int temp;
        System.out.println("a = " + a + " b = " + b);
        temp = b;
        b = a;
        a = temp;
        System.out.println("a = " + a + " b = " + b);
    }
}
