package ZohoArrays;

import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
int j=0;
        System.out.println("the leaders are");
        for(int i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            if(j==n){
                System.out.println(arr[i]+" ");
            }

        }


    }
}