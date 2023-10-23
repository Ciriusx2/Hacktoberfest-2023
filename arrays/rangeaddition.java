package arrays;

import java.util.Scanner;

public class rangeaddition {
    public static int[] getmodifiedarray(int length, int[][] queries) {
        int[] res = new int[length];
        // provide impact to res
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int inc = queries[i][2];
            res[start] += inc;
            if (end +1 < length) {
                res[end + 1] -= inc;
            }
        }
        // prefix sum array
        int sum = 0;
        for (int i = 0; i < length; i++) {

            sum += res[i];
            res[i] = sum;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int nq = sc.nextInt();
        int[][] queries = new int[nq][3];
        for (int q = 0; q < nq; q++) {
            queries[q][0] = sc.nextInt();
            queries[q][1] = sc.nextInt();
            queries[q][2] = sc.nextInt();
        }
        int[] res = getmodifiedarray(length, queries);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

}
