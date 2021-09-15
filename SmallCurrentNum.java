package ZohoArrays;

import java.util.Scanner;

public class SmallCurrentNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int count=0;
        int k=0;
        int[] newArr=new int[n];
        //logic
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[j]<arr[i]){
                    count++;
                    //System.out.println(count);

                }

            }
            newArr[k++]=count;
            count=0;
        }

        //print
        for(int i=0;i<k;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
