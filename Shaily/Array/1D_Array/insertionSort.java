public class insertionSort {

    // Function to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position

            // 12, 11, 13, 5, 6       i = 1  j = 0  key = 11, arr[j] = 12
            // 12, 12, 13, 5, 6,      j = -1 
            // 11, 12, 13, 5, 6       i = 2 j = 1 key = 13 arr[j] = 12
            // 11, 12, 13, 5, 6       i = 3 j = 2 key = 5 arr[j] = 13
            // 11, 12, 13, 13, 6      i = 3 j = 1 key = 5 arr[j] = 12
            // 11, 12, 12, 13, 6      i = 3 j = 0 key = 5 arr[j] = 11
            // 11, 11, 12, 13, 6      i = 3 j = -1 key = 5 loop break
            // arr[0] = 5
            // 5, 11, 12, 13, 6       i = 4 j = 3 key = 6 arr[j] = 13
            // 5, 11, 12, 13, 13      i = 4 j = 2 key = 6 arr[j] = 12
            // 5, 11, 12, 12, 13      i = 4 j = 1 key = 6 arr[j] = 11
            // 5, 11, 11, 12, 13      i = 4 j = 0 key = 6 arr[j] = 5  loop break
            // 5, 6, 11, 12, 13         sorted array
            

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample array
        int[] arr = {12, 11, 13, 5, 6};

        // Display the array before sorting
        System.out.println("Before sorting:");
        printArray(arr);

        // Perform insertion sort
        insertionSort(arr);

        // Display the array after sorting
        System.out.println("After sorting:");
        printArray(arr);
    }
}
