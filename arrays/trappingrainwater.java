package arrays;

import java.util.Scanner;

public class trappingrainwater {
    static int mostWater(int heights[]) {
        int i = 0;
        int j = heights.length - 1;
        int res = 0;
        while (i < j) {
            int w = j - i;
            int h = Math.min(heights[i], heights[j]);
            res = Math.max(res, h * w);
            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int heights[] = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        int res = mostWater(heights);
        System.out.println(res);
    }
}
