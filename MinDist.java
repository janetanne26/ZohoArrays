package ZohoArrays;

import java.util.Scanner;

public class MinDist {
    public static int minDist(int a[], int n, int x, int y) {
        int recent_x = -1;
        int recent_y = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                recent_x = i;


                if (recent_y != -1)
                    ans = Math.min(Math.abs(recent_x - recent_y), ans);
            } else if (a[i] == y) {
                recent_y = i;


                if (recent_x != -1)
                    ans = Math.min(Math.abs(recent_x - recent_y), ans);
            }
        }


        if (ans == Integer.MAX_VALUE) return -1;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the x value");
        int x=sc.nextInt();
        System.out.println("enter y value");
        int y=sc.nextInt();
        System.out.println(minDist(a,n,x,y));
    }
}
