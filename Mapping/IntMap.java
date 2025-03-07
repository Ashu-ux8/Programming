import java.util.*;

class Frequency{
    public static void occurence(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();

        //adding elements into Map -  if the number already exist(key) increments its value, if doesn't exist add it and initialize its value as 1
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1); //incrementing value
            }
            else{
                map.put(arr[i], 1); //initializing value as 1
            }
        }

        
        //Traversing a Map

        System.out.println("Elements and their frequency: ");
        for(Map.Entry<Integer, Integer> pair : map.entrySet()){
            System.out.println(pair.getKey()+" : "+pair.getValue());
        }
    }
}
class IntMap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Size - > ");
        int n = sc.nextInt();

        int[] origArr = new int[n];
        System.out.println("Elements of array -> ");
        for(int i=0; i<n; i++){
            origArr[i] = sc.nextInt();
        }

        Frequency.occurence(origArr, n);

        sc.close();
        
    }
}