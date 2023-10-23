package arrays;

import java.util.Scanner;

public class barchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for(int floor=max; floor>=1;floor--){
            for(int i=0;i<arr.length;i++){
                if(floor>=arr[i]){
                    System.out.print(" * ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
        
    }

}
