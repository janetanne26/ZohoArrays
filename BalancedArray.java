package ZohoArrays;

import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n/2;i++){
          sum1=sum1+arr[i];
            //System.out.println("sum1: "+sum1);
        }
        for(int i=n/2;i<n;i++){
            sum2=sum2+arr[i];
            //System.out.println("sum2: "+sum2);
        }
int diff=0;
        if(sum1<sum2||sum1>sum2){
            diff=Math.abs(sum1-sum2);
        }
        System.out.println(diff);

    }
}
