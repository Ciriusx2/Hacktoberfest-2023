package arrays;

import java.util.Scanner;

public class rotatearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        display(arr);
        rotate(arr, k);
        System.out.println();
        display(arr);
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void reverse(int a[], int i, int j) {
        int li = i;
        int ri = j;
        while (li < j) {
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void rotate(int a[], int k) {
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }
        // part 1

        reverse(a, 0, a.length - k - 1);
        // part
        reverse(a, a.length - k, a.length - 1);
        // All
        reverse(a, 0, a.length - 1);
    }

}
