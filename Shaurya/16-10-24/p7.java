import java.util.Scanner;

class p7 {
    public void palin(String str) {
        String reverse = "";
        boolean result = false;   

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }

        result = str.equals(reverse);

        if (result == true) {
            System.out.println(str + " is a Palindrome string");
        } else {
            System.out.println(str + " is not a Palindrome string");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        p7 obj = new p7();
        obj.palin(input);
    }
}
