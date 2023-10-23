package arrays;

import java.util.Scanner;

public class matrixmul {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[r1][c1] = sc.nextInt();
            }
        }
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                a[r2][c2] = sc.nextInt();
            }
        }
        sc.close();
        if (c1 != r2) {
            System.out.println("Invalid input");
        }
        int prod[][] = new int[r1][c2];
        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                for (int k = 0; k < c1; k++) {
                    prod[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                System.out.print(prod[i][j]);
            }
            System.out.println();
        }

    }

}
