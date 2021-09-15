package ZohoArrays;

import java.util.Scanner;

public class Kadane {
   public static long maxSubarraySum(int arr[], int n){

        // Your code herelong sum=0;
        long max=arr[0];
        long sum=0;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];

            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxSubarraySum(arr,n));

    }
}
