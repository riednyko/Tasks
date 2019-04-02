package tasks;

public class SumOfPositiveElements {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * (10));
                sum=sum + a[i][j];
                System.out.print(a[i][j] + " ");
            }
 
        }
        System.out.println(sum);
    }
}

