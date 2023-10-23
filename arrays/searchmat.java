package arrays;

import java.util.Scanner;

public class searchmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[][] = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int data = sc.nextInt();
        sc.close();
        int i = 0;
        int j = a[0].length - 1;
        while (i < a.length && j >= 0) {
            if (data == a[i][j]) {
                System.out.print(i + " " + j);
                return;
            } else if (data > a[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("Not found");

    }
}
