package Sorting;

import java.util.Scanner;
public class InsertionRecursive {
    
    public static void insertionOptimized(int arr[], int i, int n){
        if(n == i ) return;

        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }

        
        insertionOptimized(arr, i+1, n);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size -> ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Array Elements -> ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        insertionOptimized(arr, 0, n);

        System.out.println("\nAfter insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }

}

