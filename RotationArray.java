package ZohoArrays;

import java.util.Scanner;

public class RotationArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n=sc.nextInt();
        System.out.println("enter the rotating value");
        int val=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int j=0;
        while(j<val) {
            int a=arr[0];
            for (int i = 0;i<n-1;i++) {
                 arr[i]=arr[i+1];

            }
            arr[n-1]=a;
            j++;


        }
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
