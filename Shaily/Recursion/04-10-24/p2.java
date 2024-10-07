class p2 {
    public static int binarySearch(int arr[], int s, int e, int target) {
        if(s > e) {
            return -1;
        }
        int mid = (s + e) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        if(target > arr[mid]) {
            return binarySearch(arr, mid + 1, e, target);
        }
        else {
            return binarySearch(arr, s, mid - 1, target);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int target = 90;
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = binarySearch(arr, s, e, target);
        System.out.println("Answer is: " + ans);
    }
}