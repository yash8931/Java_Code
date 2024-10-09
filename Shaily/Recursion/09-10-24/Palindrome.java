public class Palindrome {
    private int num;
    private int rev;

    // Parameterized constructor
    public Palindrome(int nn) {
        this.num = nn;
        this.rev = 0;
    }

    // Recursive method to calculate reverse of the number
    private int revNum(int i) {
        if (i == 0) {
            return 0;
        }
        rev = (rev * 10) + (i % 10);
        revNum(i / 10);
        return rev;
    }

    // Method to check if the number is palindrome
    public void check() {
        int reverse = revNum(num);
        if (num == reverse) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is not a Palindrome.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Palindrome p = new Palindrome(121);
        p.check();
    }
}


// Output: 
// 121 is a Palindrome.