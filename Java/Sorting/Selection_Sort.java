package Sorting;

public class Selection_Sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // time complexity = O(n^2)
    // Not that much good efficient for sorting purpose
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        // One swap per iteration
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i]; // Replacing starting element to smallest element
            arr[i] = temp; // Replacing smallest element to starting element
        }
        printArray(arr);
    }
}
