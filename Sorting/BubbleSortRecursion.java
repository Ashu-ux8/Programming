package Sorting;
import java.util.*;
public class BubbleSortRecursion {
    int[] arr;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Size -> ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Array Elements -> ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted Array: ");
        bubbleOptimized(arr, n);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }

    public static void bubbleOptimized(int arr[], int n){
        if(n == 1){
            return;
        }
        
        boolean didSwap = false;
        for(int i=0; i < n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp; 
                didSwap = true;
            }
        }

        if(didSwap == false){
            System.out.println("Already Sorted array");
            return;
        } 

        //recursively call bubbleOptimized()
        bubbleOptimized(arr, n-1);
    }
}
