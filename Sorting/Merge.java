package Sorting;

//{ Driver Code Starts
import java.io.*;

class Sorting {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution();
            Solution.quickSort(arr, 0, n - 1);
            printArray(arr);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        
        if(low<high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[low]; //considering 1st element as pivot
        int i = low;
        int j = high;
        
        while(i<j){
            while(arr[i]< pivot && i < high) i++; //unitl arr[i] < pivot move fwd
            
            while(arr[j]> pivot && j > low) j--; // until arr[j] > pivot move bkwd
            
            if(i<j){
                swap(arr, arr[i], arr[j]); //when done and i!>j swap
            }  
        }
        
        swap(arr, arr[low], arr[j]); //when i>j swap pivot to its correct pos
        return j;
    }
    
    public static void swap(int[] arr, int low, int high){
        int temp = low;
        low = high;
        high = temp;
    
    }
    

}
