import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int n = str.length();
        System.out.println(n);
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j <= i; ++j) {
                char ch = str.charAt(j);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
