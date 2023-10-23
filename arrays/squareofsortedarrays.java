package arrays;

import java.util.Scanner;

public class squareofsortedarrays {
    static int[] solution(int arr[]) {
        int res[] = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;
        int idx = res.length - 1;
        while (i < j) {
            int val1 = arr[i] * arr[i];
            int val2 = arr[j] * arr[j];
            if (val1 > val2) {
                res[idx] = val1;
                i++;
            } else {
                res[idx] = val2;
                j--;
            }
            idx--;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res[] = solution(a);
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
