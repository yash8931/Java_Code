public class Armstrong {
    int num;

    public void getnum(int number) {
        this.num = number;
    }

    public int countdigit(int a) {
        if (a == 0) {
            return 0;
        }
        return 1 + countdigit(a / 10);
    }

    public int sumpower(int a, int p) {
        if (a == 0) {
            return 0;
        }
        int digit = a % 10;
        return (int) Math.pow(digit, p) + sumpower(a / 10, p);
    }

    public void isArmstrong() {
        int digits = countdigit(num);
        int sum = sumpower(num, digits);
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
        obj.getnum(153);
        obj.isArmstrong();
        
        obj.getnum(371);
        obj.isArmstrong();
        
        obj.getnum(1643);
        obj.isArmstrong();
    }
}


// Output:
// 153 is an Armstrong number.
// 371 is an Armstrong number.
// 1643 is not an Armstrong number.