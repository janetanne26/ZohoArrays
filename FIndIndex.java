package ZohoArrays;

import java.util.Scanner;

public class FIndIndex {

    public static int findIndexOfEle(int[] arr,int key){
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
               return i;

            }
           //break;
        }
        return  -1;
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
        System.out.println("enter the key to be searched");
       int key=sc.nextInt();
        System.out.println(findIndexOfEle(arr,key));
    }
}
