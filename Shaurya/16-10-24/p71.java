import java.util.Scanner;

class p71 {
    public boolean palin(String str) {
        int s = 0;
        int e = str.length() - 1;

        while(s <= e) {
            if(str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        p71 obj = new p71();
        boolean result = obj.palin(input);
        if (result == true) {
            System.out.println(" Palindrome string");
        } else {
            System.out.println("not a Palindrome string");
        }
    }
}
