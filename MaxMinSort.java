package ZohoArrays;

import java.util.Scanner;

public class MaxMinSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] newArr = new int[n];
        //logic
        int temp=0;
        //sorting
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
int k=0;
       int s=n-1;
        //maxmin

        for(int j=1;j<n;j=j+2){
           newArr[j]=arr[k++];
        }

        for(int m=0;m<n;m=m+2){
            newArr[m]=arr[s--];
        }



        //print
        for(int i=0;i<n;i++){
            System.out.println(newArr[i]);
        }



    }
}
