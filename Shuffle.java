package ZohoArrays;

import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //int split=n/2;
        int[] newArr=new int[n];
        int k=n/2;
        int s=0;
        //maxmin

        for(int j=1;j<n;j=j+2){
            newArr[j]=arr[k++];
        }

        for(int m=0;m<n;m=m+2){
            newArr[m]=arr[s++];
        }

        //print
        for(int i=0;i<n;i++){
            System.out.println(newArr[i]);
        }
    }
}
