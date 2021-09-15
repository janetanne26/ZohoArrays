package ZohoArrays;

import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
int maxcount=0;
        int ind=0;

        for(int i=0;i<n;i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

                if (count > maxcount) {
                    maxcount = count;
                    ind = j;
                }
            }
        }

        if(maxcount>n/2){
            System.out.println(arr[ind]);
        }
        else{
            System.out.println("-1");
        }

    }

}
