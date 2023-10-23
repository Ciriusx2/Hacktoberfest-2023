package arrays;

import java.util.Scanner;

public class saddlepoint {
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
        sc.close();
        for (int i = 0; i < a.length; i++) {
            int svj = 0;
            for (int j = 1; j < a[0].length; j++) {
                if (a[i][svj] < a[i][j]) {
                    svj = j;
                }
            }
            boolean flag = true;
            for (int k = 0; k < a.length; k++) {
                if (a[k][svj] > a[i][svj]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(a[i][svj]);
                return;

            }
        }

        System.out.println("invalid");
    }
}
