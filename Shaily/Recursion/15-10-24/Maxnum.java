import java.util.Scanner;

class Maxnum {
    int[] arr;
    int n;
    int max;

    Maxnum(int nn) {
        n = nn;
        arr = new int[n];
    }

    void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    int maximum(int i) {
        if (i == 0) {
            return arr[0];
        }
        max = maximum(i - 1);
        if (arr[i] > max) {
            return arr[i];
        } else {
            return max;
        }
    }

    void print() {
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nLargest Number: " + maximum(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        Maxnum obj = new Maxnum(size);
        obj.fillarray();
        obj.print();
    }
}


// Output: 
// Enter the size of the array: 5
// Enter 5 elements:
// 15 17 4 3 12
// Array elements:
// 15 17 4 3 12
// Largest Number: 17
