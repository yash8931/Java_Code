// Print Digits of the Number
class p1 {
    public static void printDigits(int no) {
        if(no == 0) {
            return;
        }

        int digit = no % 10;
        System.out.print(digit + " ");
        
        printDigits(no / 10);
    }
    public static void main(String[] args) {
        int no = 1234;
        printDigits(no);
    }
}