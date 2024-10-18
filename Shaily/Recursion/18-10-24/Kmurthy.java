public class Kmurthy {
    int num;

    public void getnum(int number) {
        this.num = number;
    }

    public int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        return a * factorial(a - 1);
    }

    public int sumfact(int x) {
        if (x == 0) {
            return 0;
        }
        int digit = x % 10;
        return factorial(digit) + sumfact(x / 10);
    }

    public void check() {
        int sum = sumfact(num);
        if (sum == num) {
            System.out.println(num + " is a Krishnamurthy number.");
        } else {
            System.out.println(num + " is not a Krishnamurthy number.");
        }
    }

    public static void main(String[] args) {
        Kmurthy km = new Kmurthy();
        km.getnum(145);  // Example of a Krishnamurthy number
        km.check();
        
        km.getnum(10);  // Example of a non-Krishnamurthy number
        km.check();
    }
}


// Output:
// 145 is a Krishnamurthy number.
// 10 is not a Krishnamurthy number.