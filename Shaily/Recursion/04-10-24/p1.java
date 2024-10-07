import java.util.*;
class p1 {
    public static boolean checkSorted(int arr[], int n, int i) {
        if(i == n - 1) {
            return true;
        }

        if(arr[i + 1] < arr[i]) {
            return false;
        }

        return checkSorted(arr, n, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};

        int n = arr.length;
        int i = 0;

        boolean isSorted = checkSorted(arr, n, i);
        if(isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}