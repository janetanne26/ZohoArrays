package ZohoArrays;

import java.util.Scanner;

public class MinDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int diff=Math.abs(arr[i]-arr[j]);
                if(diff<min){
                    min=diff;
                }
            }
        }
        System.out.println(min);
    }
}