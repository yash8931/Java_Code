import java.util.Scanner;

public class Palword {
    String w;
    String rw;

    String revword(String x) {
        if (x.length() == 0) {
            return "";
        } else {
            return revword(x.substring(1)) + x.charAt(0);
        }
    }

    void check(String word) {
        rw = revword(word);
        if (word.equals(rw)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine().toUpperCase();

        Palword p = new Palword();
        p.check(word);
    }
}