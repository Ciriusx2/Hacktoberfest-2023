package arrays;
import java.util.Scanner;
public class majorityelement1{
    public static int validcandidate(int [] arr){
        int val=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(val==arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                val=arr[i];
                count=1;
            }
        }
        return val;
    }
    public static void solution(int []arr){
        int val=validcandidate(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(val==arr[i]){
                count++;
            }
        }
        if(count>arr.length/2){
            System.out.println("Majority Element is "+val+" and it occurs more than n/2 times");
        }
        else{
            System.out.println("No Majority element found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        solution(a);
    }
}