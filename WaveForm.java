package ZohoArrays;

import java.util.Scanner;

public class WaveForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] newArr=new int[n];
                //logic
        int temp=0;
       for(int i=0;i<n-1;i=i+2){
           for(int j=i+1;j<n;j=j+2){
               if(arr[j]>arr[i]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                   break;
               }
           }
       }
        //print
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
