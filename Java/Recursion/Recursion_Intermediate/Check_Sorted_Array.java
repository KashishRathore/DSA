package Recursion.Recursion_Intermediate;

// Q -> Check if an array is sorted.(Strictly increasing)

public class Check_Sorted_Array {
    public static boolean isSorted(int arr[] , int idx){
        if(idx == arr.length-1){
            return true;
        }
         if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
         }
         else{
            return false;
         }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7};
        boolean ans = isSorted(arr, 0);
        System.out.println(ans);
    }
}
