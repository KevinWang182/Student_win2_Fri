package w2;

import java.util.Scanner;

public class My2DArray {
    public static void print2DArray(int[][] arr) {
        String arrPrint = "";
        
        for(int[] i : arr) {
            for(int j : i)
                arrPrint += String.format("%-5d", j);
            arrPrint += "\n";
        }
        
        System.out.println(arrPrint);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] values = new int[5][3];
        
        for (int[] value : values)
            for (int i = 0; i < value.length; i++) {
                System.out.print("Enter a number: ");
                value[i] = input.nextInt();
            }
        
        print2DArray(values);
    }
    
}
