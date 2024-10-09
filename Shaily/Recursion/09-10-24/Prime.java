public class Prime {
    int num;

    // Parameterized constructor
    public Prime(int nn) {
        this.num = nn;
    }

    // Recursive method to count factors
    private int countFactors(int i) {
        if (i == 1) {
            return 1; // 1 is a factor of any number
        }
        if (num % i == 0) {
            return 1 + countFactors(i - 1); // Count this factor and continue
        } else {
            return countFactors(i - 1); // Skip this number and continue
        }
    }

    // Method to check if the number is prime
    public void check() {
        int factors = countFactors(num);
        if (factors == 2) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Prime p = new Prime(17);
        p.check();
    }
}


// Output:

// 17 is a Prime number.