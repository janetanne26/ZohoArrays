package ZohoArrays;

import java.util.Scanner;

public class PositiveNegative {
    public static int[] rearrange(int arr[], int n) {
        // code here
        int s = 0;
        int m = 0;
        int[] pos = new int[n];
        int[] neg = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos[s++] = arr[i];

            } else {
                neg[m++] = arr[i];

            }
        }
        int l = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && l < s) {
                arr[i] = pos[l++];

            } else if (i % 2 != 0 && t < m) {
                arr[i] = neg[t++];

            } else if (t >= m && l < s) {
                arr[i] = pos[l++];
            } else if (l >= s && t < m) {
                arr[i] = neg[t++];
            }
        }

return arr;
    }

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of array elements");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("enter the array elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] array=rearrange(arr,n);
            for(int i=0;i<n;i++){
                System.out.println(array[i]);
            }

        }
    }

