package arrays;
import java.util.*;
import java.util.Scanner;
public class minimumNoOfPlatforms{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        sc.close();
        System.out.print(solution(a, b,n));
    }
    public static int solution(int a[],int b[],int n){
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        int res=1;
        int curr=0;
        while(i<n){
            if(a[i]<=b[j]){
                i++;
                curr++;
            }
            else{
                curr--;
                j++;
            }
            res=Math.max(res, curr);
        }
        return res;

    }

}