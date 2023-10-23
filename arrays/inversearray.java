package arrays;

import java.util.Scanner;

 class inversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        display(arr);
        System.out.print(inverse(arr));
        System.out.println();
        display(arr);
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static int[] inverse(int a[]) {
        int inv[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            
            // Check if the value is within a valid range
            if (v < 0 || v >= a.length) {
                // Handle invalid input gracefully, e.g., throw an exception or return an error value.
                throw new IllegalArgumentException("Invalid input value found: " + v);
            }
            
            inv[v] = i;
        }
        return inv;
    }
    
    

}
