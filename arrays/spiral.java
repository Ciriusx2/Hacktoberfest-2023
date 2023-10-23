package arrays;

import java.util.Scanner;

public class spiral {
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
        int minr = 0;
        int minc = 0;
        int maxr = a.length - 1;
        int maxc = a[0].length - 1;
        int tne=n*m;
        int cnt=0;
        while (cnt<tne) {
            // left wall
            for (int i = minr, j = minc; i <= maxr && cnt<tne; i++) {
                System.out.print(a[i][j] + " ");
                cnt++;
            }
            minc++;
            // bottom wall
            for (int i = maxr, j = minc; j <= maxc&& cnt<tne; j++) {
                System.out.print(a[i][j] + " ");
                cnt++;
            }
            maxr--;
            // Right wall
            for (int i = maxr, j = maxc; i >= minr&& cnt<tne; i--) {
                System.out.print(a[i][j] + " ");
                cnt++;
            }
            maxc--;
            // top wall
            for (int i = minr, j = maxc; j >= minc&& cnt<tne; j--) {
                System.out.print(a[i][j] + " ");
                cnt++;
            }
            minr++;
            
        }
    }
}