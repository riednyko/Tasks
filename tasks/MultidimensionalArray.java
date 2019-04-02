package tasks;

import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
               
    int[][][] matrix = new int[2][1][3];

    for (int i = 0; i < matrix.length; i++) {
        
        for (int j = 0; j < matrix[i].length; j++) {
            
            for (int k = 0; k < matrix[i][j].length; k++) {
                matrix[i][j][k] = in.nextInt();
                
                
            } 
            
        }
            
    }
    
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            int min = matrix[i][j][0];
            for (int k = 0; k < matrix[i][j].length; k++) {
                if(min > matrix[i][j][k]){
                    min = matrix[i][j][k];
                }
            }
            System.out.println("Min[" + i + "][" + j + "]: " + min);
        }
    }
    
    }
}

