package arrays;

import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int g=0;g<a.length;g++){
            for(int i=0,j=g; j<a.length;i++,j++){
                System.out.println(a[i][j]);

            }
        }
    }
}
